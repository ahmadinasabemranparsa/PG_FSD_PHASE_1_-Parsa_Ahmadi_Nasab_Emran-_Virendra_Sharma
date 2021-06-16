package Assignment_Strings;

public class Strings_Assignment {

	public static void main(String[] args) {
		String t = "Delhi";
		String o = "Mumbai";
		String k = "delhi";
		String y = new String("Mumbai");
		String l = new String("delhi");
		String p = new String("Hello");
		
		System.out.println("o.equals(l): " + o.equals(l));
		System.out.println("o == l: " + (o == l));
		
		System.out.println("y.equals(p): " + y.equals(p));
		System.out.println("y == p: " + (y == p));
		
		System.out.println("t.equals(o): " + t.equals(o));
		System.out.println("t == o: " + (t == o));
		
		System.out.println("k.equals(y): " + k.equals(y));
		System.out.println("k == y: " + (k == y));
		
		System.out.println("p.equals(y): " + p.equals(y));
		System.out.println("p == y: " + (p == y));

	}

}
