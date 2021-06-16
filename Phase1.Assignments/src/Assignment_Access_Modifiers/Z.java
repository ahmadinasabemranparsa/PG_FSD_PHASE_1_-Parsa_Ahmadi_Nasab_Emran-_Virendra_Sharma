package Assignment_Access_Modifiers;

public class Z extends N {

	public static void main(String[] args) {
		M m = new M();
		N n = new N();
		P p = new P();
		X x = new X();
		
		// System.out.println("add-M: " + m.add()); // private method in class M that can't be called outside of class M
		System.out.println("subtract-M: " + m.subtract());
		System.out.println("multiply-M: " + m.multiply());
		
		System.out.println("add-N: " + n.add());
		System.out.println("subtract-N: " + n.subtract());
		System.out.println("multiply-N: " + n.multiply());
		
		System.out.println("hello-P: " + p.hello());
		System.out.println("health-P: " + p.health());
		// System.out.println("lunch: " + p.lunch); // private method in class M that can't be called outside of class M
		System.out.println("breakfast-P: " + p.breakfast());
		
		System.out.println("num-X: " + x.num);
		System.out.println("num1-X: " + x.num1);
		System.out.println("num2-X: " + x.num2);
		System.out.println("c-X: " + x.c);

	}

}
