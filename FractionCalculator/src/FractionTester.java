public class FractionTester {
    public static void main(String[] args) {

        // testing the full constructor
        Fraction frac1 = new Fraction(1, 4);
        System.out.println("Numerator of frac1: " + frac1.getNumerator());
        System.out.println("Expected: 1");
        System.out.println("Denominator of frac1: " + frac1.getDenominator());
        System.out.println("Expected: 4");

        // testing bumping the negative sign to numerator
        Fraction frac2 = new Fraction(1, -3);
        System.out.println("Numerator of frac2: " + frac2.getNumerator());
        System.out.println("Expected: -1");
        System.out.println("Denominator of frac2: " + frac2.getDenominator());
        System.out.println("Expected: 3");

        // testing the removal of the double negative sign
        Fraction frac3 = new Fraction(-2, -5);
        System.out.println("Numerator of frac3: " + frac3.getNumerator());
        System.out.println("Expected: 2");
        System.out.println("Denominator of frac3: " + frac3.getDenominator());
        System.out.println("Expected: 5");

        // testing the numerator-only constructor
        Fraction frac4 = new Fraction(3);
        System.out.println("Numerator of frac4: " + frac4.getNumerator());
        System.out.println("Expected: 3");
        System.out.println("Denominator of frac4: " + frac4.getDenominator());
        System.out.println("Expected: 1");

        // testing the no-parameter constructor
        Fraction frac5 = new Fraction();
        System.out.println("Numerator of frac5: " + frac5.getNumerator());
        System.out.println("Expected: 0");
        System.out.println("Denominator of frac5: " + frac5.getDenominator());
        System.out.println("Expected: 1");

        // testing the toString method
        System.out.println("Testing the toString method.");
        System.out.println(frac5.toString());
        System.out.println("Expected: 0/1");

        System.out.println("Testing the toDouble method for 1/4: " + frac1.toDouble());
        System.out.println("Expected: 0.25");
        System.out.println("Testing the toDouble method for -1/3: " + frac2.toDouble());
        System.out.println("Expected: -0.3333333...");
        
    }
}