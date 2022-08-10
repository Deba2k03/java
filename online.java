public class online
{
public static void main(String args[])
{
StringBuffer s=new StringBuffer("sony");
String sr="sony";
String r="minu";
s.setLength(4);
System.out.println(s.charAt(2)+"\t\t charAt() method");
System.out.println(s+"\t\t setlength() method");
System.out.println(s.append("minu")+"\t\t append() method");
System.out.println(s.insert(4,"min")+"\t\t insert() method");
System.out.println(sr.concat(r)+"\t\t concat() method");
System.out.println(s.equals("sony")+"\t\t equals() method");
}
}
