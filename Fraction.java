public class Fraction {
    private static Fraction zero = new Fraction(0, 1);

    private int num;   // the numerator
    private int den;   // the denominator

    public Fraction(int numerator, int denominator) {

        if (denominator == 0) {
           throw new RuntimeException("Denominator is zero");
        }
        
        // reduce fraction
        int g = gcd(numerator, denominator);
        num = numerator   / g;
        den = denominator / g;
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
    
    public int compareTo(Fraction b) {
        Fraction a = this;
        int lhs = a.num * b.den;
        int rhs = a.den * b.num;
        if (lhs < rhs) return -1;   // a < b
        if (lhs > rhs) return +1;   // a > b
        return 0;                   // a = b
    }

    private static int gcd(int m, int n) {
        if (m < 0) m = -m;
        if (n < 0) n = -n;
        if (0 == n)     return m;
        else            return gcd(n, m % n);
    }

    private static int lcm(int m, int n) {
        if (m < 0) m = -m;
        if (n < 0) n = -n;
        return m * (n / gcd(m, n)); 
    }
}
