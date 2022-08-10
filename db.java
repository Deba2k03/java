import java.util.Scanner;
class db
{
public static void main(String args[])
{
int i=0k,j,n;
int b[]=new int[40];
Scanner S=new Scanner(System.in);
System.out.println("Enter a decimal no:");
n=S.nextInt();
while(n>0)
{
b[i++]=n%2;
n=n/2;
}
System.out.println("the binary number is:");
for(j=i;j>0;j--)
{
System.out.println(b[j]);
}
}
}