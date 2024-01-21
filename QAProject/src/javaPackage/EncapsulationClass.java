package javaPackage;

public class EncapsulationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankDetails obj = new BankDetails();
		obj.setID(1001);
		System.out.println(obj.getId());
	}

}


class BankDetails 
{
	private int acctId;
	// setter
	void setID(int id)
	{
		acctId=id;
	}
	// getter
	int getId()
	{
		return acctId; 
		
	}
	
	
}
