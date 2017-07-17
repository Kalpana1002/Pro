import java.util.*;
class delDigit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String n=sc.next();
int k=sc.nextInt();
String arr[]=n.split("");
Arrays.sort(arr);
for(int i=0;i<n.length()-k;i++)
System.out.print(arr[i]);
}
}
