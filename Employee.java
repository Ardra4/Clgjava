import java.util.*;
class Employeeprgm
{
	String name[]=new String[5];;
	int empno[]=new int[5];;
	int phoneno[]=new int[5];
	void Student(String name[],int empno[],int phoneno[])
	{
		
		this.name=name;
		this.empno=empno;
		this.phoneno=phoneno;
	}
	void read(){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
		System.out.println("Enter the name of a employee:");
		name[i]=sc.next();
		System.out.println("Enter the employee no. :");
		empno[i] =sc.nextInt();
		System.out.println("Enter the phone no.:");
		phoneno[i] =sc.nextInt();}}
	void display()
	{
		for(int i=0;i<5;i++){
		System.out.println("Name of the employee"+(i+1)+":"+name[i]);
		System.out.println("Employee no:"+(i+1)+":"+empno[i]);
		System.out.println("Phone no.:"+(i+1)+":"+phoneno[i]);}
	}}
	class Employee{
	public static void main(String args[])
	{
		int phoneno,empno;
		String name;
		Employeeprgm sc=new Employeeprgm();
		sc.read();
		sc.display();}}


	
