package Assignment_Access_Modifiers;

public class P {
	
	public String hello () {
		return "hello";
	}
	
	String health () {
		return "health";
	}
	
	private String lunch () {
		return "lunch";
	}
	
	protected String breakfast () {
		return "breakfast";
	}

	public static void main(String[] args) {
		
		M m = new M();
		N n = new N();
		
		System.out.println("a-M: " + m.a);
		System.out.println("b-M: " + m.b);
		System.out.println("c-M: " + m.c);
		System.out.println("d-M: " + m.d);
		System.out.println("e-M: " + m.e);
		System.out.println("f-M: " + m.f);
		
		System.out.println("a-N: " + n.a);
		System.out.println("b-N: " + n.b);
		System.out.println("c-N: " + n.c);
		System.out.println("d-N: " + n.d);
		System.out.println("e-N: " + n.e);
		System.out.println("f-N: " + n.f);
		
	}

}
