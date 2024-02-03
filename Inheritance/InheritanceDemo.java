package Inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		AdvCalcV2 obj1=new AdvCalcV2();
		
		int r1=obj1.add(9, 7);
		
        int r2=obj1.sub(9, 7);
        
        int r3=obj1.mul(9,7);
        
        int r4= obj1.div(9, 7);
        
        int r5 =obj1.ModularDiv(9, 7);
        
        System.out.println("Addition is "+r1);
        System.out.println("Substraction is "+r2);
        System.out.println("Multiplication  is "+r3);
        System.out.println("Division is "+r4);
        System.out.println("Modular division is "+r5);
	}

}
