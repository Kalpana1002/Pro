import java.util.*;
class panagram
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
if(s.length()>=26)
{
Set<Character> ss=new HashSet<Character>();
for(int i=0;i<s.length();i++)
ss.add(s.charAt(i));
if(ss.size()==26)
System.out.println("The String is panagram");
else
System.out.println("The String is not panagram");
}
else
System.out.println("The String is not panagram");
}
}
