import java.util.*;
class Perimeteroverload{
	int l,b,r,rad,len,br,a;
	Perimeteroverload(int  rad)
	{
	a=2*3*rad;}
	Perimeteroverload(int l,int b){
	a=2*(l+b);
	}
	int Peri()
	{
	return(a);
	}
}
class Perimeter{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius of circle:");
	int r=sc.nextInt();
	System.out.println("Enter the length & breadth of rectangle:");
	int len=sc.nextInt();
	int br=sc.nextInt();
	Perimeteroverload s=new Perimeteroverload(r);
Perimeteroverload s1=new Perimeteroverload(len,br);
	System.out.println("Perimeter of circle:"+s.Peri());
	System.out.println("Perimeter of rectangle:"+s1.Peri());


}}
