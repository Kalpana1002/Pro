import java.util.*;
class NumtoStr
{
    public static void main(String args[])
    {
        int count=1;
        boolean boo[]=new boolean[args[0].length()-1];
        for(int i=0;i<args[0].length()-1;i++)
        {
            int n=Integer.parseInt(args[0].substring(i,i+2));
            if(n>=1&&n<26)
            {
                count++;
                boo[i]=true;
            }
        }
        for(int i=0;i<boo.length-2;i++)
        {
            if(boo[i]&&boo[i+2])
                count++;
        }
        System.out.print(count);
    }
}
