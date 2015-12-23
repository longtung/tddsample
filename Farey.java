package com.hsung.tdd;

public class Farey {
	
	public boolean start(int val) {
		// TODO Auto-generated method stub
		if(val <= 0)
			return false;
		
		int a = 0, b = 1, c = 1, d = 0;
		Fraction one = new Fraction(a, b);
		Fraction r1  = new Fraction(1, val);
		Fraction r0  = new Fraction(c, d);
		
		System.out.print("Farey[" + val + "]: ");
		
		while (r0.toDouble() < r1.toDouble()) {
			System.out.print(r0.toString() + "  ");
			int num = (r0.denominator() / r1.denominator()) * r1.numerator() - r0.numerator();
			int den = (r0.denominator() / r1.denominator()) * r1.denominator() - r0.denominator();
			
			Fraction tmp = new Fraction(num, den);
			r0 = r1;
			r1 = tmp;
		}
		System.out.println(r0);

		return true;
	}
    
    
}
