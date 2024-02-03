package StaticVAriable;

public class StaticVDemo {

	public static void main(String[] args) {
		
		
		Mobile object = new Mobile();
		Mobile object1 = new Mobile();
		
		object.Brand="Apple";
		object.Price=150000;
		Mobile.type="Smartphone";
		
		System.out.println(object.Brand+" "+object.Price);
		System.out.println(Mobile.type);
		
		object1.Brand="Vivo";
		object1.Price=15000;
		Mobile.type="Smartphone";
		
		System.out.println(object1.Brand+" "+object1.Price);
		System.out.println(Mobile.type);
		
		
		
		
	

	}

}
