import java.io.*;
import java.util.*;
class binarydes
{
    public static void main(String args[])
    {
    int m,sum=0;
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int num[]=new int[n];
        String bi[]=new String[n];
        int des[]=new int[n];
        for(int inp=0;inp<n;inp++)
        {
            num[inp]=scan.nextInt();
        }
        for(int i=0;i<num.length;i++)
        {
            bi[i]=Integer.toBinaryString(num[i]);
            while(bi[i]>0)
            {
            m=bi[i]%10;
            sum=sum+m;
            bi[i]=bi[i]/10;
            }
            des[i]=sum;
   System.out.println(des[i]);
        }
        
    }
}
