class sumcmd
{
public static void main(String args[])
{
int sum=0,val;
for(int i=0;i<args.length;i++)
{
val=Integer.parseInt(args[i]);
sum=val+sum;
}
System.out.println("Sum is :"+sum);
}
}