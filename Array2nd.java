import java.util.*;
class Array2nd{
public static void main(String args[])
{
	int n;
	System.out.println("Enter the no.of elements:");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	System.out.println("Enter the elements:");
	int num[]=new int[n];
	for(int i=0;i<n;i++)
		num[i]=sc.nextInt();
	int largest=num[0];
	for(int i=1;i<n;i++)
	{
		if(num[i]>largest)
			largest=num[i];
	}
	int slargest=num[0];
	for(int i=1;i<n;i++)
	{
		if(num[i]>slargest && num[i]<largest)
		slargest=num[i];
	}
	System.out.println("The 2nd largest number is:"+slargest);
}}
