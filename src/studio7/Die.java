package studio7;

public class Die {
	private int n;
	
	public Die(int n) {
		this.n = n;
	}
	public int random() {
		return (int) ((Math.random()*n)+1);
	}
	public static void main(String[]args) {
	Die a = new Die(10);
	System.out.println(a.random());	
	}
}
