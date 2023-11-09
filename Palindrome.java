import java.util.*;
class  Palindrome{
public static void main(String args[])
{
	String rev="";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:");
	String str=sc.nextLine();
	int length=str.length();
	for(int i=length-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);}
		boolean s=str.equals(rev);
		if(s==true) 
		System.out.println(str+" is a palindrome.");
		else
		System.out.println(str+" is not a palindrome.");
	}}
