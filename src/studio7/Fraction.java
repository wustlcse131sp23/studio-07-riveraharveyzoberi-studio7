package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction add(Fraction b) {
		numerator = this.numerator * b.denominator + b.numerator*this.denominator;
		denominator = this.denominator * b.denominator;
		Fraction result = new Fraction(numerator, denominator);
		return result;
	}
	public Fraction multiply(Fraction b) {
		numerator = this.numerator * b.numerator;
		denominator =  this.denominator * b.denominator;
		Fraction result = new Fraction (numerator, denominator);
		return result;
	}
	public Fraction reciprocal() {
		int temp = this.denominator;
		denominator = this.numerator;
		numerator = temp;
		Fraction result = new Fraction (numerator, denominator);
		return result;
	}
	public static void main(String[]args) {
		Fraction a = new Fraction (1,2);
		Fraction b = new Fraction (1,2);
		System.out.println(a.reciprocal());
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		}

	@Override
	public String toString() {
		return "Fraction [numerator=" + numerator + ", denominator=" + denominator + "]";
	}
	
}
