package Abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
		
		car obj=new Audi();
		
		obj.drive();
		obj.playmusic();
		
		
		Helicopter obj2=new ArmyHeliCop();
		obj2.Fly();
		obj2.Shoot();
		/////////////////////////////ATM
		
		
		
		ATM obj3=new CitiBank();
		obj3.withdraw();
		obj3.CheckBalance();
		
		///////////////////Phone
		
		
		phone obj1=new Iphone();
		
		obj1.call();
		obj1.PlayVdo();
		
        
	}

}
