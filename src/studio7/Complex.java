package studio7;

public class Complex {
	private double real;
	private double imaginary;
	
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public Complex add(Complex other) {
		double newReal = this.real + other.real;
		double newImaginary = this.imaginary + other.imaginary;
		return new Complex(newReal, newImaginary);
	}
	
	public Complex multiply(Complex other) {
		double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
		double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
		return new Complex(newReal, newImaginary);
	}
	
	public String toString() {
		if (imaginary >= 0) {
			return real + " + " + imaginary + "i";
		} else {
			return real + " - " + (-imaginary) + "i";
		}
	}
	
	public static void main(String[] args) {
		Complex complex1 = new Complex(3.0, 4.0);
		Complex complex2 = new Complex(1.0, -2.0);
		
		Complex sum = complex1.add(complex2);
		Complex product = complex1.multiply(complex2);
		
		System.out.println("Complex1: " + complex1);
		System.out.println("Complex2: " + complex2);
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
	}
}
