class x{
public static void main(String args[])
{
int a[]={1,2,3,4,5};
int m=a[0];
for(int i=0;i<a.length;i++)
{
if(m<a[i])
{
m=a[i];
}
}
int s=a[0];
for(int j=0;j<a.length;j++)
{
if(s>a[j])
{
s=a[j];
}
}
System.out.println("maximum element in arrray is"+m);
System.out.println("minimum element in array is"+s);
}
}