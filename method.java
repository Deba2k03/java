public class method
{
int add(int x,int y)
{
int sum=x+y;
return sum;
}
void input()
{
System.out.println("hello");
}
public static void main(String args[])
{
method ob=new method();
int a=ob.add(24,26);
System.out.println("Sum of two number is:"+a);
ob.input();
}
}