import java.io.*;
import java.util.*;
class binarydes
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int num[]=new int[n];
        int bi[]=new int[n];
        int di[]=new int[n];
        for(int inp=0;inp<n;inp++)
        {
            num[inp]=scan.nextInt();
            String s=Integer.toBinaryString(num[inp]);
            bi[inp]=s.length()-s.replaceAll("1","").length();
        }
        System.arraycopy(bi,0,di,0,bi.length);
        Arrays.sort(bi);
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(bi[i]==di[j] && num[j]!=0)
                {
                    System.out.println(num[j]);
                    num[j]=0;
                    break;
                }
            }
        }
        
    }
}
