package MultipleInheritance;

import Inheritance.calc;

public class MUltipleInheritanceDEmo {

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		
		int r1=obj.Add(9, 7);
		
		int r2=obj.sub(9, 7);
		
		int r3= obj.mul(9, 7);
		
		int r4=obj.div(9, 7);
		
		
		
		
		System.out.println("Addition is "+r1);
		System.out.println("Substraction "+r2);
		System.out.println("Multiplication "+r3);
		System.out.println("Division "+r4);
		
		
		

	}

}
