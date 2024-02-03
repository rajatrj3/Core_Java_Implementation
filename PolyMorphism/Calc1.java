package PolyMorphism;

////////////////////////////////////////////////////////////////////
 //////////////////COMPILE TIME POLYMORPHISM///////////////////////
///////////////////METHOD OVERLOADING//////////////////////////////



public class Calc1 {
	
	
	public int add(int a,int b) {
		System.out.println("IN method 1");
		return a+b;
		
		
	}
	public double add(double a,double b) {
		System.out.println("IN method 2");
		return a+b;
		
	}
	
	public static void main(String[] args) {
		
		Calc1 obj=new Calc1();
		
		;
		
	
		System.out.println("addition is " +obj.add(8.2,8.36));
		
	}


}
