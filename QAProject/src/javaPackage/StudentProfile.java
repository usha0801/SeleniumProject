package javaPackage;

public class StudentProfile extends StudentPortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentProfile obj= new StudentProfile();
		obj.loginCredentals();
	}

	@Override
	void loginCredentals() {
		// TODO Auto-generated method stub
		System.out.println("The username and password");
	}

}

abstract class StudentPortal
{
	abstract void loginCredentals();
	
	void studentProfile()
	{
		System.out.println("The name of student is usharani");
		System.out.println("The designation is tester");
	}
}
