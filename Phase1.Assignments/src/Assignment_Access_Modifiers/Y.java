package Assignment_Access_Modifiers;

public class Y extends M {

	public static void main(String[] args) {
		M m = new M();
		
		// System.out.println("add function in M class: " + m.add()); // private method in class M that can't be called outside of class M
		
		System.out.println("multiply function in M class: " + m.multiply());
		System.out.println("subtract function in M class: " + m.subtract());
		
		N n = new N();
		
		System.out.println("add function in N class: " + n.add());
		System.out.println("multiply function in N class: " + n.multiply());
		System.out.println("add function in N class: " + n.subtract());
		
		X x = new X();
		
		System.out.println("num-X: " + x.num);
		System.out.println("num1-X: " + x.num1);
		System.out.println("num2-X: " + x.num2);
		System.out.println("c-X: " + x.c);

	}

}
