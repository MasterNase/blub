public class test {

    public static void main(String[] args) {

        Fraction f = new Fraction(17,1);
        Fraction f1 = new Fraction(42,2);
        Fraction f2 = new Fraction(1,4);

        f2.multiply(2);
        System.out.printf("Numerator: %d,Denominator: %d\n",f2.getNumerator(),f2.getDenominator());

        f1.multiply(f2);
        System.out.printf("Numerator: %d,Denominator: %d\n",f1.getNumerator(),f1.getDenominator());

        f2.divide(f1);
        System.out.printf("Numerator: %d,Denominator: %d\n",f2.getNumerator(),f2.getDenominator());

    }
}
