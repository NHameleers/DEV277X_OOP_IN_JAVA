import jdk.nashorn.internal.runtime.arrays.NumericElements;

/** The Fraction class is an object that holds information
 *  about a fraction (numerator and denominator). */
public class Fraction {
    
    public static void main(String[] args) {

    }


    // fields

    private int numerator;
    private int denominator;


    // Constructors

    /** Construct a fraction by setting both numerator and denominator */
    public Fraction(int aNumerator, int aDenominator) {
        
        if (aDenominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be set to zero");
        }

        // if both numerator and denominator are negative, swap sign of both
        if (aNumerator < 0 && aDenominator < 0) {
            aNumerator = -1 * aNumerator;
            aDenominator = -1 * aDenominator;
        }
        // if only the denominator is negative, bump the negative sign to the numerator
        else if (aNumerator >= 0 && aDenominator < 0) {
            aNumerator = -1 * aNumerator;
            aDenominator = -1 * aDenominator; 
        }
        numerator = aNumerator;
        denominator = aDenominator;
    }

    /** Construct a fraction by setting only the numerator 
     * (e.g. Fraction(3) =  3/1) */
    public Fraction(int aNumerator) {
        this(aNumerator, 1);
    }

    /** Construct the fraction 0/1 */
    public Fraction() {
        this(0, 1);
    }



    // methods

    /** Exposes the value of the numerator field to the user */
    public int getNumerator() {
        return numerator;
    }

    /** Exposes the value of the denominator field to the user */
    public int getDenominator() {
        return denominator;
    }

    /** "numerator/denominator", a String representation of the Fraction */
    public String toString() {
        return numerator + "/" + denominator;
    }

    /** the result of numerator / denominator */
    public double toDouble() {
        return ((double) numerator) / denominator;
    }

    /** returns a new Fraction that is the sum of other and this fraction */
    public Fraction add(Fraction other) {
        return Fraction();
    }

    /** returns a new Fraction that is the difference between the other and this fraction */
    public Fraction subtract(Fraction other) {
        return Fraction();
    }

    /** returns a new Fraction that is the product of the other and this fraction */
    public Fraction multiply(Fraction other) {
        return Fraction();
    }

}