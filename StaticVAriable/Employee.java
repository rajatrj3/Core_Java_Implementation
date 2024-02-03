package StaticVAriable;

public class Employee {

	
	    // Static variable to track the total number of employees
	    private static int totalEmployees = 0;

	    // Instance variables
	    private int employeeId;
	    private String name;

	    // Constructor
	    public Employee(String name) {
	        this.employeeId = ++totalEmployees; // Assign a unique ID to each employee
	        this.name = name;
	    }

	    // Getter methods
	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public String getName() {
	        return name;
	    }

	    // Static method to get the total number of employees
	    public static int getTotalEmployees() {
	        return totalEmployees;
	    }
	}

	
	

