package ExeceptionHandling;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args)  throws ArithmeticException {
		
		
		Bank  obj1=new Bank();
		
		 int b=10000;
		int w=20000;
        
        obj1.withdraw(b, w);

	}

}
