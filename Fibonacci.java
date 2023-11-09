import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		int f=0,s=1,i,n,t;
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(	System.in);
		n=sc.nextInt();
		
	for(i=2;i<=n;i++)
	{
		System.out.println(f+""+s);
		t=f+s;
		f=s;
		s=t;
		if(n<10)
		System.out.println(""+t);
	}
	}
}
