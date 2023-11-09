import java.util.*;
class Employee
{
	String name;
	int age,phoneno;
	double salary;
	String address;
void printSalary()
{
	System.out.println("Salary:"+salary);
}}
class Officer extends Employee{
	String specialization;
}
class 	Manager extends Employee{
	String department;
}
class Employeprgm{
	public static void main(String args[])
	{
		Officer s=new Officer();
		s.name="Francis";
		s.age=35;
		s.phoneno=98766544;
		s.address="Rose villa,Banglore";
		s.salary=50000.0;
		s.specialization="Specialized field.";
		
		Manager m=new Manager();
		m.name="Edwin";
		m.age=48;
		m.phoneno=979707983;
		m.address="Kohinoor villa,Banglore";
		m.salary=78000.0;
		m.department="Finance";
		

		System.out.println("Officer details:");
		System.out.println("Name:"+s.name);
		System.out.println("Age:"+s.age);
		System.out.println("Phone no.:"+s.phoneno);
		System.out.println("Address:"+s.address);
		s.printSalary();
		System.out.println("Specialization:"+s.specialization);
	
		System.out.println("Manager details:");
		System.out.println("Name:"+m.name);
		System.out.println("Age:"+m.age);
		System.out.println("Phone no.:"+m.phoneno);
		System.out.println("Address:"+m.address);
		m.printSalary();
		System.out.println("Department:"+m.department);
		
		}} 
