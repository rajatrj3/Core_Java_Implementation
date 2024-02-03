package ExeceptionHandling;

public class Bank {
	
	
	
	public int withdraw(int b,int w) throws ArithmeticException {
		
		if(w<=b) {
			System.out.println("withdraw sucessfull");
			 int c=b-w;
			System.out.println("remaining balance :"+c+"RS");
		}
		else {
			
			try {
		throw new ArithmeticException("Insufficient Funds");
		
		}catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		}
		
	
	return 0;
	}
}
