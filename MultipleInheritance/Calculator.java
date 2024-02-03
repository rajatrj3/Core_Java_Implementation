package MultipleInheritance;

public class Calculator implements Addition, Substraction {
	
	@Override
	public int Add(int a,int b) {
		
		return a+b;	
	}
	
	@Override
	public int sub(int a,int b) {
		return a-b;
		
		
	}
    public int mul(int a,int b) {
		return a*b;
	}
	
	public int div(int a,int b) {
		return a/b;
	}

	


}
