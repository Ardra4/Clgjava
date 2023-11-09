import java.util.*;
class Lmatrix{
public static void main(String args[])
{
	int i,r,c;
	System.out.println("Enter the size of rows:");
	Scanner sc=new Scanner(System.in);
	r=sc.nextInt();
	System.out.println("Enter the size of cols:");
	c=sc.nextInt();
	int num[][]=new int[r][c];
	System.out.println("Enter the elements of array:");
	for(i=0;i<r;i++)
		for(int j=0;j<r;j++)
			num[i][j]=sc.nextInt();
	System.out.println("Matrix A:");
	for(i=0;i<r;i++)
		for(int j=0;j<r;j++)
			System.out.println(num[i][j]+" ");
	int large=num[0][0];
	for(i=0;i<r;i++)
		for( int j=0;j<r;j++)
			if(num[i][j]>large)
				large=num[i][j];
	System.out.println("Largest element of array:"+ large);}}
