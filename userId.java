import java.util.*;
class userId
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String fn=sc.nextLine();
String ln=sc.nextLine();
String pin=sc.nextLine();
int n=sc.nextInt();
String arr[]={fn,ln};
Arrays.sort(arr);
String res="";
//System.out.println(arr[0]);
res=((fn.length()>ln.length())?fn.substring(0,1)+ln:(fn.length()==ln.length())?arr[1].substring(0,1)+arr[0]:ln.substring(0,1)+fn);
for(int i=0;i<res.length();i++)
{
char ch=res.charAt(i);
if(Character.isLowerCase(ch))
System.out.print(String.valueOf(ch).toUpperCase());
else
System.out.print(String.valueOf(ch).toLowerCase());
}
System.out.print(pin.charAt(n-1)+""+pin.charAt(pin.length()-n));
}
}

