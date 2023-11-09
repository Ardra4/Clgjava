import java.util.*;
class Multiply
{
	public static void main(String args[])
	{
		int a,b;
		System.out.println("Enter two numbers:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Multiple of " +a+ " and " +b+ " is " +(a*b));
	}
}
