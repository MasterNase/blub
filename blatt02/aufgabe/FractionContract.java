import de.vksi.c4j.ClassInvariant;
import de.vksi.c4j.PureTarget;
import de.vksi.c4j.Target;

import static de.vksi.c4j.Condition.*;

public class FractionContract extends Fraction {

    @Target
    private Fraction target;

    @ClassInvariant
    public void classInvariant() {
        assert target.getDenominator() != 0 : "denominator != 0";
    }

    @PureTarget
    public int getNumerator() {

        return ignored();

    }

    @PureTarget
    public int getDenominator() {

        return ignored();
    }

    public FractionContract(int numerator, int denominator) {
        super(numerator, denominator);
        if (preCondition()) {
            assert denominator != 0;
        }

        if (postCondition()) {
            assert target.getDenominator() == denominator : "denominator set";
            assert target.getNumerator() == numerator : "numerator set";
        }
    }

    @Override
    public void multiply(int multiplier) {
        if (preCondition()) {
            assert target.getDenominator() != 0;
        }

        if (postCondition()) {
            assert unchanged(target.getDenominator()) : "denominator unchanged";
        }
    }

    @Override
    public void multiply(Fraction fract) {
        if (preCondition()) {
            assert target.getDenominator() != 0;
            assert fract.getDenominator() != 0;
        }
    }

    @Override
    public void divide(Fraction fract) {
        if (preCondition()) {
            assert target.getDenominator() != 0;
            assert fract.getNumerator() != 0;
            assert fract.getDenominator() != 0;
        }
    }/**/
}