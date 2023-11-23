import java.util.*;
class Employee{
	void display()
	{
		System.out.println("Name of the class is Employee.");
	}
	void calcSalary(){
		System.out.println("Salary of Employee is 10000");}
}
class Enginner extends Employee
{
	void calcSalary(){
	System.out.println("Salary of Employee is 20000");
}}
public class Engineerprgm{
	public static void main(String args[])
	{
		Employee em=new Employee();
		em.display();
		em.calcSalary();
	}}
