import java.util.*;
class  Frequencystr{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int f=0;
	System.out.println("Enter the string:");
	String str=sc.nextLine();
	System.out.println("Enter the character:");
	char c=sc.next().charAt(0);
	int l=str.length();
	for(int i=0;i<l;i++)
		if(str.charAt(i)==c)
			f++;
	if(f!=0)
		System.out.println(str+" character is "+c+"found at"+f+"times.");
		else
		System.out.println("character is not found.");}}
