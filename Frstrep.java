import java.util.*;
class Frstrep
{
  public static void main(String args[])
  {
      int flag = 0;
    int arr[] = new int[args.length];
    for(int i=0; i<args.length; i++)
    arr[i] = Integer.parseInt(args[i]);
    for(int i=0; i<arr.length; i++)
    {
      for(int j=i+1; j<arr.length;j++)
      {
        if(arr[i]==arr[j])
        {
            System.out.println(arr[i]);
            flag = 1;
            break;
        }
      }
      if(flag==1)
      break;
    }
  }
}
      
