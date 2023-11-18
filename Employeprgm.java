import java.util.*;
class Employee
{
	String name;
	int age,salary;
	long phoneno;
	String address;
	void printSalary()
	{
		System.out.println("Salary of employee:"+salary);
	}
}
class Officer extends Employee{
	String specialization;
}
class 	Manager extends Employee{
	String department;
}
class Employeprgm{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Scanner ad=new Scanner(System.in);
		Officer o=new Officer();
		System.out.println("Enter the name of the officer:");
		o.name=sc.nextLine();
		System.out.println("Enter the age of the officer:");
		o.age=sc.nextInt();
		System.out.println("Enter the phoneno. of the officer:");
		o.phoneno=sc.nextLong();
		System.out.println("Enter the salary of the officer:");
		o.salary=sc.nextInt();
		System.out.println("Enter the address of the officer:");
		o.address=ad.next();
		System.out.println("Enter the Specialization of the officer:" );
		o.specialization=sc.next();
	
		Manager m=new Manager();
		System.out.println("Enter the name of the manager:");
		m.name=sc.next();
		System.out.println("Enter the age of the manager:");
		m.age=sc.nextInt();
		System.out.println("Enter the phoneno. of the manager:");
		m.phoneno=sc.nextLong();
		System.out.println("Enter the salary of the manager:");
		m.salary=sc.nextInt();
		System.out.println("Enter the address of the manager:");
		m.address=ad.next();
		System.out.println("Enter the department of the manager:" );
		m.department=sc.next();

		System.out.println("\tOfficer details:");
		System.out.println("Name:"+o.name);
		System.out.println("Age:"+o.age);
		System.out.println("phone no:"+o.phoneno);
		System.out.println("Address:"+o.address);
		System.out.println("specialization:"+o.specialization);
		o.printSalary();
		
		System.out.println("\tManager details:");
		System.out.println("Name:"+m.name);
		System.out.println("Age:"+m.age);
		System.out.println("phone no:"+m.phoneno);
		System.out.println("Address:"+m.address);
		System.out.println("Department:"+m.department);
		m.printSalary();
		}} 
