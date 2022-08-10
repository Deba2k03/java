
class Except
{
public static void main(String args[])
{
try
{
System.out.println("hello");
int c=10/0;
System.out.println(c);
}
catch(Exception e)
{
System.out.println(e);
}
}
}