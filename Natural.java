import java.util.*;
class Natural{
public static void main(String args[])
{
	int i,n,sum=0;
	System.out.println("Enter the size of an array:");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int num[]=new int[n];
	System.out.println("Enter the elements of array:");
	for(i=0;i<n;i++)
	{
		num[i]=sc.nextInt();
	}for(i=0;i<n;i++){
	sum=sum+num[i];}
	System.out.print("Sum of the elements in an array:"+sum);
	
}
}
