package Assignment_Access_Modifiers;

class M {
	protected int a = 3;
	protected int b = 5;
	protected long c = 56575645;
	protected long d = 2342349;
	protected float e = 45.65f;
	protected float f = 23.56f;
	
	private int add () {
		return a + b;
	}
	
	long subtract () {
		return c - d;
	}
	
	protected float multiply () {
		return e * f;
	}
}
