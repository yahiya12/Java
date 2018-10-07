import java.util.*;
import java.lang.*;
public class Stringdiffer_Onechar
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
        String s1=sc.next();
        char a[]=s.toCharArray();
        char a1[]=s1.toCharArray();
        int flag=0;
        if(a.length==a1.length)
        {
        for(int i=0;i<a.length;i++)
        {
               if(a[i]!=a1[i])
                {
                    flag++;
                }
                
        }
        if(flag==1)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
        }
        else
        {
            System.out.print("no");
        }
        
    }
}


