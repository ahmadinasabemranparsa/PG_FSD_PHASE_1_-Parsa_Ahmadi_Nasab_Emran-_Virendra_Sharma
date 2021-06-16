package Assignment_Exception;

import java.io.IOException;
import java.util.Scanner;

public class Exeception_Assignment {
	
	public static int calculate (int l, int b) throws IOException {
		int area = areaFunc(l, b);
		return area;
	}
	
	public static int areaFunc (int l, int b) throws IOException {
		int area = display(l, b);
		return area;
	}
	
	public static int display (int l, int b) throws IOException {
		int area;
		
		if (l > b) {
			throw new IOException("length is greater than width");
		}
		
		area = l * b;
		
		return area;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle: ");
		int l = scanner.nextInt();
		
		System.out.println("Enter the width of the rectangle: ");
		int b = scanner.nextInt();
		
		int area = calculate(l, b);
		
		System.out.println("The area of the rectangle is: " + area);

	}

}
