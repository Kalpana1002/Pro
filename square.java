import java.util.*;
class square
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[][]=new int[4][2];
for(int i=0;i<4;i++)
{
for(int j=0;j<2;j++)
{
arr[i][j]=sc.nextInt();
}
}
System.out.print((arr[0][0]==arr[1][0] && arr[1][1]==arr[2][1] && arr[2][0]==arr[3][0] && arr[0][1]==arr[3][1])?"Square":"Not a Square");
}
}
