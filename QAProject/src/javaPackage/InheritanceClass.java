package javaPackage;

public class InheritanceClass implements LoginUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student obj1= new Student();
		obj1.profile();
		obj1.loginDetails();
		obj1.departmnet();
		obj1.admistration();
	}

	@Override
	public void updateusername() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatepassword() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProfile() {
		// TODO Auto-generated method stub
		
	}

}


class University
{
	
	void departmnet()

	{
		System.out.println("This is it  department ");
	}
	void admistration()
	{
		System.out.println("This is admission cell");
	}
}

class Student extends  University
{
	
	void profile()
	{
		System.out.println(" The name of student");
	}
	void loginDetails()
	{
		System.out.println("The username and password ");
	}
}
