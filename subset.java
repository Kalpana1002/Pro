import java.util.*;
class subset
{
public static void main(String args[])
{
int count = 0;
Scanner sc = new Scanner(System.in);
//Enter the size of the array a1
int n1 = sc.nextInt();
int a1[] = new int[n1];
//Enter the value of the array a1
for(int i=0;i<n1;i++)
a1[i] = sc.nextInt();
//Enter the size of the array a2
int n2 =sc.nextInt();
int a2[] = new int[n2];
//Enter the value of the array a2
for(int i=0;i<n2;i++)
a2[i] = sc.nextInt();
for(int j=0;j<n1;j++)
{
for(int k=0;k<n2;k++)
{
if(a1[j]==a2[k])
{count++;
break;}
}
}
if(count==n1)
System.out.println("a1 is subset of a2");
else
System.out.println("a1 is not subset of a2");
}
}
