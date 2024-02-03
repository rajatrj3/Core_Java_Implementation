package Abstraction;

public class ArmyHeliCop implements Helicopter {

	@Override
	public void Fly() {
		System.out.println("Helicopter is Flying");
		
	}

	@Override
	public void Shoot() {
		
		System.out.println("Gun loaded ready to fire");
		
		
	}

}
