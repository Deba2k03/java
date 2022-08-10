
import java.util.Scanner;
class Factorial
{
    public static void main(String args[])
    {
        int n,fact=1;
        System.out.println("Enter a number=");
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        for(int i=n;i>0;i--)
        {
            fact=fact*i; 
        }
        System.out.print("factoprial of the number is:"+fact);
    }
}