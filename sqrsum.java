import java.util.*;
class sqrsum
{
public static void main(String args[])
{
int sum=0,sum1=1;
Scanner sc=new Scanner(System.in);
String s=sc.nextLine(),ss="";
for(int i=0;i<s.length();i++)
{
if(Character.isDigit(s.charAt(i)))
ss+=String.valueOf(s.charAt(i));
}
char ch[]=ss.toCharArray();
Arrays.sort(ch);
int n=Integer.parseInt(String.valueOf(ch[ch.length-1]));
int m=Integer.parseInt(String.valueOf(ch[0]));
for(int i=0;i<ch.length;i++)
{
    sum+=(n*Integer.parseInt(String.valueOf(ch[i])));
    sum1*=(m+Integer.parseInt(String.valueOf(ch[i])));
}
int res=sum%9;
int op1=(res==0)?9:res;
int res1=sum1%9;
int op2=(res1==0)?9:res1;
if(op1<op2)
System.out.println(op1*op1);
else
System.out.println(op2*op2);
}
}

