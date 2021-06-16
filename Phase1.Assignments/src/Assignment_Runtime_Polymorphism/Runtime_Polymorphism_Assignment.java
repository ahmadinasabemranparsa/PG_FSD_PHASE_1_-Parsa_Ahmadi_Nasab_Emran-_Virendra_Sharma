package Assignment_Runtime_Polymorphism;

class Vehicle {
	protected int speed = 45;
	protected long distance = 65;
	
	public Vehicle () {
		System.out.println("Inside the Vehicle class default constructor");
	}
	
	public Vehicle (int speed, long distance) {
		this.speed = speed;
		this.distance = distance;
	}
	
	public void run () {
		System.out.println("Vehicle is running...");
	}
	
	public void stop () {
		System.out.println("Vehicle is stopping...");
	}
	
	public void display () {
		System.out.println("speed-Vehicle: " + this.speed);
		System.out.println("distance-Vehicle: " + this.distance);
	}
	
	public void fuel (int a) {
		System.out.println("a-fuel1: " + a);
	}
	
	public void fuel (float a, String s) {
		System.out.println("a-fuel2: " + a);
		System.out.println("s-fuel2: " + s);
	}
	
	public void fuel (char c, int b) {
		System.out.println("c-fuel3: " + c);
		System.out.println("b-fuel3: " + b);
	}
}

class twoWheeler extends Vehicle {
	protected int speed = 25;
	protected long distance = 23;
	protected int nos_of_tyre = 2;
	
	public twoWheeler () {
		System.out.println("inside the twoWheeler class default constructor");
	}
	
	public void run () {
		System.out.println("2 wheeler is running...");
	}
	
	public void stop () {
		System.out.println("2 wheeler is stopping...");
	}
	
	public void display () {
		System.out.println("speed-Vehicle: " + super.speed);
		System.out.println("distance-Vehicle: " + super.distance);
		System.out.println("speed-twoWheeler: " + this.speed);
		System.out.println("distance-twoWheeler: " + this.distance);
		System.out.println("nos_of_tyre-twoWheeler: " + this.nos_of_tyre);
	}
}

class threeWheeler extends Vehicle {
	protected int speed = 55;
	protected long distance = 35;
	protected int nos_of_tyre = 3;
	
	public threeWheeler () {
		System.out.println("inside the threeWheeler class default constructor");
	}
	
	public void run () {
		System.out.println("3 wheeler is running...");
	}
	
	public void stop () {
		System.out.println("3 wheeler is stopping...");
	}
	
	public void display () {
		System.out.println("speed-Vehicle: " + super.speed);
		System.out.println("distance-Vehicle: " + super.distance);
		System.out.println("speed-threeWheeler: " + this.speed);
		System.out.println("distance-threeWheeler: " + this.distance);
		System.out.println("nos_of_tyre-threeWheeler: " + this.nos_of_tyre);
	}
}

class fourWheeler extends Vehicle {
	protected int speed = 57;
	protected long distance = 67;
	protected int nos_of_tyre = 4;
	
	public fourWheeler () {
		System.out.println("inside the fourWheeler class default constructor");
	}
	
	public void run () {
		System.out.println("4 wheeler is running...");
	}
	
	public void stop () {
		System.out.println("4 wheeler is stopping...");
	}
	
	public void display () {
		System.out.println("speed-Vehicle: " + super.speed);
		System.out.println("distance-Vehicle: " + super.distance);
		System.out.println("speed-fourWheeler: " + this.speed);
		System.out.println("distance-fourWheeler: " + this.distance);
		System.out.println("nos_of_tyre-fourWheeler: " + this.nos_of_tyre);
	}
}

class eightWheeler extends Vehicle {
	protected int speed = 65;
	protected long distance = 45;
	protected int nos_of_tyre = 8;
	
	public eightWheeler () {
		System.out.println("inside the eightWheeler class default constructor");
	}
	
	public void run () {
		System.out.println("8 wheeler is running...");
	}
	
	public void stop () {
		System.out.println("8 wheeler is stopping...");
	}
	
	public void display () {
		System.out.println("speed-Vehicle: " + super.speed);
		System.out.println("distance-Vehicle: " + super.distance);
		System.out.println("speed-eightWheeler: " + this.speed);
		System.out.println("distance-eightWheeler: " + this.distance);
		System.out.println("nos_of_tyre-eightWheeler: " + this.nos_of_tyre);
	}
}

public class Runtime_Polymorphism_Assignment {

	public static void main(String[] args) {
		Vehicle v;
		
		v = new Vehicle();
		v.run();
		v.fuel(56);
		v.fuel('f', 34);
		v.fuel(12, "fuel");
		v.stop();
		v.display();
		
		v = new Vehicle(32, 78);
		v.run();
		v.fuel(67);
		v.fuel('g', 23);
		v.fuel(43, "more fuel");
		v.stop();
		v.display();
		
		v = new twoWheeler();
		v.run();
		v.stop();
		v.display();
		
		v = new threeWheeler();
		v.run();
		v.stop();
		v.display();
		
		v = new fourWheeler();
		v.run();
		v.stop();
		v.display();
		
		v = new eightWheeler();
		v.run();
		v.stop();
		v.display();
	}

}