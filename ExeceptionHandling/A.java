package ExeceptionHandling;

public class A {
	
	
	
	public int divide(int i, int j) 
	{
		int c;
		
		
		try {
			c=i/j;
			
	         }catch (ArithmeticException e){
				
				System.out.println(e);
                 		 
			}
		   
		
		finally {
			
			System.out.println("Division is Performed Output Is above....BYE");
			
		}
				
			

       return 0;
		
	}
}
