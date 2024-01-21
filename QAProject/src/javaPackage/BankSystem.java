package javaPackage;

public class BankSystem {
	int amt =1000;
	
	BankSystem(String username,String password)
	{
		System.out.println("username"+ "password");
	}
	
	void deposit(int dep)
	{
		amt=amt+dep;
		System.out.println("The amount after deposit "+amt);
	}
	void withdraw(int wt)
	{
		amt = amt-wt;
		System.out.println("the amount after the withdraw "+amt);
	}
	
	int display()
	{
		return amt;
	}
	
	

	public static void main(String[] args) {
		// Create a object 
		BankSystem a= new BankSystem("username ","password");
		a.deposit(1000);
		a.withdraw(500);
		System.out.println(a.display());
	
	}

}
