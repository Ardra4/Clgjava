import java.util.*;
class MUltiply{
public static void main(String args[])
{
	int n;
	System.out.println("Enter the size of rows of 1st matrix:");
	Scanner obj=new Scanner(System.in);
	n=obj.nextInt();
	System.out.println("Enter the size of cols 1st matrix:");
	n=obj.nextInt();
	int num[][]=new int[n][n];
	System.out.println("Enter the elements of array:");
	for( int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			num[i][j]=obj.nextInt();}}
	System.out.println("Enter the size of rows of 2nd matrix:");
	n=obj.nextInt();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of cols 2nd matrix:");
	n=obj.nextInt();
	int num2[][]=new int[n][n];
	System.out.println("Enter the elements of array:");
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			num2[i][j]=obj.nextInt();}}
	int num3[][]=new int[n][n];
	for( int i=0;i<n;i++){
		for(int j=0;j<n;j++){
		for(int k=0;k<n;k++){
		num3[i][j]+=num[i][j]*num2[k][j];}}}
	System.out.println("The product of 1st and 2nd array:");
	for( int i=0;i<n;i++){
		for(int j=0;j<n;j++){
	System.out.println(num3[i][j]+" 	");}
	System.out.println("");}}}
