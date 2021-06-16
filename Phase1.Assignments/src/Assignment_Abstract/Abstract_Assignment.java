package Assignment_Abstract;

abstract class MNC {
	abstract void run();
	abstract void walk();
	
	public MNC () {
		System.out.println("inside abstract class MNC");
	}
	
	public void health () {
		System.out.println("I am healthy!");
	}
}

abstract class Infosys extends MNC {
	public void run () {
		System.out.println("I am running!");
	}
}

class Hello extends Infosys {
	public void run () {
		System.out.println("I am still running!");
	}
	
	public void walk () {
		System.out.println("I am walking!");
	}
}

public class Abstract_Assignment {

	public static void main(String[] args) {
		Infosys infosys = new Hello();
		
		infosys.health();
		infosys.walk();
		infosys.run();

	}

}
