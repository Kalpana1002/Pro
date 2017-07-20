import java.util.*;
class FindRepeat
{
public static void main(String args[])
{
int arr[]=new int[args.length];
for(int i=0;i<args.length;i++)
arr[i]=Integer.parseInt(args[i]);
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
System.out.print(arr[j]+" ");
}
}
}
}
