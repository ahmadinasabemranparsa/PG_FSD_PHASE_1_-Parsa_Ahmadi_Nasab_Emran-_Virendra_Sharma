package Assignment_Aggregation;

class Operation {
	int square (int n) {
		return n * n;
	}
}

class Rectangle {
	Operation op;
	int a;
	
	int area (int a) {
		op = new Operation();
		int area = op.square(a);
		return area;
	}
}

class Square {
	Operation op;
	int b;
	
	int area (int b) {
		op = new Operation();
		int area = op.square(b);
		return area;
	}
}

class AggregationExample {
	Operation op;
	double pi = 3.14;
	
	double area (int radius) {
		op = new Operation();
		int rsquare = op.square(radius);
		return pi * rsquare;
	}
}

public class Aggregation_Assignment {

	public static void main(String[] args) {
		AggregationExample c = new AggregationExample();
		double result = c.area(5);
		System.out.println("area of circle: " + result);
		
		Square square = new Square();
		int result1 = square.area(3);
		System.out.println("area of square: " + result1);
		
		Rectangle rectangle = new Rectangle();
		int result2 = rectangle.area(7);
		System.out.println("area of rectangle: " + result2);

	}

}
