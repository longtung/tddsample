public class Fraction {
    private static Fraction zero = new Fraction(0, 1);

    private int num;   // the numerator
    private int den;   // the denominator

    public Fraction(int numerator, int denominator) {

        if (denominator == 0) {
           throw new RuntimeException("Denominator is zero");
        }
        
        this.num = numerator;
        this.den = denominator;
    }

    public int numerator()   { return num; }
    public int denominator() { return den; }

    public double toDouble() {
        return (double) num / den;
    }

    public String toString() { 
        if (den == 1) return num + "";
        else          return num + "/" + den;
    }
