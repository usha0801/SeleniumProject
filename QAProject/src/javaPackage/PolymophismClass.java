package javaPackage;

public class PolymophismClass {

	void add(int a)
	{
		System.out.println(a);
	}
	void add(int a,int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Register obj = new Register();
		// method overriding runtime
		obj.empName();
		PolymophismClass obj1= new PolymophismClass();
		// method overloading complie
		obj1.add(1000);
		obj1.add(1000,2000);
	}

}

class Employee 
{
	 void empName()
	{
		System.out.println("Enter the name of Employee");
	}
	protected void empDesignation()
	{
		System.out.println("Enter the employee is testre");
	}
}


class Register extends Employee
{
	void empName()
	{
		System.out.println("The employee name is UshaRani");
	}
}