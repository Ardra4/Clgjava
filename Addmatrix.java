import java.util.*;
class Addmatrix{
public static void main(String args[])
{
	int i,r,r2,c2,c;
	System.out.println("Enter the size of rows of 1st matrix:");
	Scanner obj=new Scanner(System.in);
	r=obj.nextInt();
	System.out.println("Enter the size of cols 1st matrix:");
	c=obj.nextInt();
	int num[][]=new int[r][c];
	System.out.println("Enter the elements of array:");
	for(i=0;i<r;i++){
		for(int j=0;j<r;j++){
			num[i][j]=obj.nextInt();}}
	System.out.println("Enter the size of rows of 2nd matrix:");
	Scanner sc=new Scanner(System.in);
	r2=obj.nextInt();
	System.out.println("Enter the size of cols 2nd matrix:");
	c2=obj.nextInt();
	int num2[][]=new int[r2][c2];
	System.out.println("Enter the elements of array:");
	for(i=0;i<r;i++){
		for(int j=0;j<r;j++){
			num2[i][j]=obj.nextInt();}}
	int sum[][]=new int [r][c];
	for(i=0;i<r;i++){
		for(int j=0;j<r;j++){
			sum[i][j]=num[i][j]+num2[i][j];}}
	
	for(i=0;i<r;i++){
		for(int j=0;j<r;j++){
			System.out.print(sum[i][j]+" ");}
		System.out.println();}}}
