import java.io.*;
import java.util.*;
class encode
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
char ch1[]=s1.toCharArray();
String s2=sc.nextLine();
String s3=s2.substring(1,s2.length()-1);
char ch2[]=s3.toCharArray();
for(int i=0;i<ch1.length;i++)
{
int a=(int)ch1[i]+10;
if(a>122)
{
int b=a-122;
int c=b+96;
System.out.print((char)c);
}
else
{
System.out.print((char)a);
}
}
System.out.print(" ");
System.out.print(s2.charAt(0));
for(int i=0;i<ch2.length;i++)
{
int x=(int)ch2[i]+10;
if(x>122)
{
int y=x-122;
int z=y+96;
System.out.print((char)z);
}
else
{
System.out.print((char)x);
}
}
System.out.print(s2.charAt(s2.length()-1));
}
}
