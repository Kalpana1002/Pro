import java.util.*;
class sqrsum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char ch=s.toCharArray();
int arr[]=new int[ch.length];
for(int i=0;i<ch.length;i++)
{
if(Character.isDigit(ch[i]))
arr[i]=ch[i];
}
Arrays.sort(arr);
System.out.print(arr[0]);
}
}
