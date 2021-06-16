package Assignment_Access_Modifiers;

public class X {
	protected int num = 23;
	protected long num1 = 456345345;
	protected float num2 = 45.67f;
	protected char c = 'G';
	
	private int num () {
		return num;
	}
	
	long num1 () {
		return num1;
	}
	
	protected float num2 () {
		return num2;
	}
	
	public char c () {
		return c;
	}
}
