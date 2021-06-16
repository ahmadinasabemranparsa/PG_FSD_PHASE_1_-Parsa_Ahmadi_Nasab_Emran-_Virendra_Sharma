package Assignment_Custom_Exception;

public class Custom_Exception_Assignment {
	
	static void validate (int salary) throws SalaryException {
		if (salary < 2000) {
			throw new SalaryException("you need to work hard");
		}
		else if (salary > 2000 & salary < 5000) {
			throw new SalaryException("your salary is somehow good");
		}
		else if (salary > 5100 & salary < 9000) {
			throw new SalaryException("your salary is very good");
		}
	} 

	public static void main(String[] args) {
		
		try {
			validate(1500);
		}
		catch(Exception e) {
			System.out.println("Exception occurred: " + e);
		}
		
		try {
			validate(3500);
		}
		catch(Exception e) {
			System.out.println("Exception occurred: " + e);
		}
		
		try {
			validate(5500);
		}
		catch(Exception e) {
			System.out.println("Exception occurred: " + e);
		}
		
		System.out.println("Rest of the code...");
		
	}

}

class SalaryException extends Exception {
	SalaryException (String s) {
		super(s);
	}
}