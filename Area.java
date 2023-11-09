import java.util.*;
class Shapes{
	void area(int r){
	System.out.println("Area of circle:"+(3.14*r*r));
	}
	void area(int l,int b){
	System.out.println("Area of rectangle:"+(l*b));
	}
	void area(int b,int h,int k){
	System.out.println("Area triangle:"+(0.5*b*h));
	}
}
class Area{
	public static void main(String args[])
	{
		Shapes s=new Shapes();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
	int r=sc.nextInt();
	s.area(r);
	System.out.println("Enter the length & breadth of rectangle:");
	int len=sc.nextInt();
	int br=sc.nextInt();
	s.area(len,br);
	System.out.println("Enter the base & height of triangle:");
	int base=sc.nextInt();
	int height=sc.nextInt();
	s.area(base,height,0);
}}
