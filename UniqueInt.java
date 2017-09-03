import java.util.*;
class UniqueInt
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int num[] = new int[args.length];
int n[] = new int[10000];
for(int i=0;i<args.length;i++)
num[i] = Integer.parseInt(args[i]);   //to get Array elements
for(int i=0;i<num.length;i++)
n[num[i]] += 1;
for(int i=0;i<n.length;i++)
{
if(n[i]==1)
System.out.println(i);
}
}
}
