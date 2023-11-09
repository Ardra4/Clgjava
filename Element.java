import java.util.*;
class Element{
public static void main(String args[])
{
	int i,n;
	System.out.println("Enter the size of an array:");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int num[]=new int[n];
	System.out.println("Enter the elements of array:");
	for(i=0;i<n;i++){
		num[i]=sc.nextInt();}
	System.out.println("Enter the index of array to be replaced:");
	int index=sc.nextInt();
	System.out.println("replacing element:");
	int rep=sc.nextInt();
	 num[index]=rep;
	for(i=0;i<n;i++)
	System.out.println("replced elements:"+num[i]);}}
