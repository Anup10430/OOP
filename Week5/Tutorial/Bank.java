package Tutorial;

abstract class Bank {
	abstract void getBalance();
}

class BankA extends Bank{
	@Override
	void getBalance(){
		System.out.println("$100 deposited in Bank A");
	}
}

class BankB extends Bank{
	@Override
	void getBalance(){
		System.out.println("$150 deposited in Bank B");
	}
}

class BankC extends Bank{
	@Override
	void getBalance(){
		System.out.println("$200 deposited in Bank C");
	}
}
