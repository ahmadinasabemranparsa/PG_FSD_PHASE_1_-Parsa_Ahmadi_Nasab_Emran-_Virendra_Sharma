package Assignment_Composition;

import java.util.ArrayList;
import java.util.List;

class Employee {
	protected String name;
	protected int age;
	protected int salary;
	
	public Employee (String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
}

class HRDepartment {
	private List<Employee> employees = new ArrayList<Employee>();
	
	public HRDepartment (List<Employee> employees) {
		this.employees = employees;
	}
	
	public List<Employee> getTotalEmployeesInHRDepartment () {
		return employees;
	}
}

public class Composition_Assignment {

	public static void main(String[] args) {
		Employee e1 = new Employee("Adam", 23, 45000);
		Employee e2 = new Employee("Bob", 25, 50000);
		Employee e3 = new Employee("David", 27, 55000);
		Employee e4 = new Employee("David", 29, 60000);
		Employee e5 = new Employee("John", 31, 65000);
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		HRDepartment HRDepartment = new HRDepartment(employees);
		
		List<Employee> listOfEmployees = HRDepartment.getTotalEmployeesInHRDepartment();
		
		for (Employee e : listOfEmployees) {
			System.out.println("Employee Name: " + e.name);
			System.out.println("Emplyee Age: " + e.age);
			System.out.println("Employee Salary: " + e.salary);
		}
		
	}

}
