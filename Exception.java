import java.util.*;
class Handling
{
    int x,y,res;
    int a[]={1,2,3,4,5};
    Handling(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    void test1()
    {
        try
        {
            res=(x+y)/(x-y);
        }catch(ArithmeticException e){System.out.println(e);}  
    }
    void test2()
    {
        try
        {
            System.out.print(a[5]);
        }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
    }
}
class  Exception
{
public static void main (String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int a,b;
        a=1;b=1;
       	Handling o=new Handling(a,b);
        o.test1();
        o.test2();
    }
}
