package StaticVAriable;

public class EmployeeDemo {
	
	    public static void main(String[] args) {
	        // Creating instances of Employee
	        Employee emp1 = new Employee("John Doe");
	        Employee emp2 = new Employee("Jane Smith");

	        // Accessing instance variables
	        System.out.println("Employee 1: ID - " + emp1.getEmployeeId() + ", Name - " + emp1.getName());
	        System.out.println("Employee 2: ID - " + emp2.getEmployeeId() + ", Name - " + emp2.getName());

	        // Accessing static variable using the class name
	        System.out.println("Total Employees: " + Employee.getTotalEmployees());
	    }
	}



