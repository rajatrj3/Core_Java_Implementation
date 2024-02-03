package Abstraction;

public class CitiBank extends ATM{

	@Override
	public void withdraw() {
		System.out.println("withdraw succesffully");
		
	}

	@Override
	public void CheckBalance() {
		System.out.println("updated balance is 65325");
		
	}

}
