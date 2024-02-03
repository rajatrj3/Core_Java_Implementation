package  Encapsulation;





public class EncapsulationDemo {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.setAge(22);
		obj.setName("Rajat");
		
		System.out.println(obj.getName()+" "+obj.getAge());
///////////////////////////////////////////////////////////////////////
		////////////BANK/////////////////////////////////////////////
		Bank obj1=new Bank();
		
		System.out.println(obj1.getACCname()+" "+obj1.getAccNo()+obj1.getBalance());
		
		
		
		
		
		

	}

}
