public class example
{
private int a;
public void input(int z)
{
a=z;
}
public void disp()
{
 a=25;
System.out.println(a);
}
public static void main(String args[])
{
example ob=new example();
ob.input(10);
ob.disp();
ob.a=15;
System.out.println(ob.a);
}
}