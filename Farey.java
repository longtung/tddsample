package com.hsung.tdd;

public class Farey {
	
	public boolean start(int val) {
		// TODO Auto-generated method stub
		if(val <= 0)
			return false;
		
		Fraction one = new Fraction(1, 1);
		Fraction r0  = new Fraction(0, 1);
		Fraction r1  = new Fraction(1, val);

		System.out.print("Farey[" + val + "]: ");
		
		while (r0.compareTo(one) < 0) {
			System.out.print(r0 + "  ");
			int num = ((r0.denominator() + val) / r1.denominator()) * r1.numerator()   - r0.numerator();
			int den = ((r0.denominator() + val) / r1.denominator()) * r1.denominator() - r0.denominator();
			
			Fraction tmp = new Fraction(num, den);
			r0 = r1;
			r1 = tmp;
		}
		System.out.println(r0);

		return true;
	}
    
    
}
