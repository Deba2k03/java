import java.util.Scanner;
public class distance
{
int d;
double inches,feet;
void convert(int d)
{
this.d=d;
feet=this.d*3280.839895;
inches=this.d*39370.07874;
System.out.println("Distance in inches="+inches);
System.out.println("Distance in feet="+feet);
}
public static void main(String args[])
{
distance d=new distance();
Scanner S=new Scanner(System.in);
System.out.println("Enter the distance in km=");
int km=S.nextInt();
d.convert(km);
}
}






































