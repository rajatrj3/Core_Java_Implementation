package ExeceptionHandling;

public class ThrowsKeyword {
	
	public void divide(int a,int b) {
		
		try {
			
		
		int c=a/b;
		System.out.println(c);
		//throw new ArithmeticException("We cannot divide any no with 0");
		}catch(ArithmeticException e) {
			System.out.println(e);
			
		}
	}
	
	
	

	public static void main(String[] args) throws Exception {
		int a=10;
		int b=0;
		
		ThrowsKeyword obj =new ThrowsKeyword();
		
		obj.divide(a, b);
		
		
	}

}
