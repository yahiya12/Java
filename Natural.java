import java.util.Scanner;
public class Natural 
{
  public static void main(String[] args)
   {
     int b=0,a,i;
     Scanner sc=new Scanner(System.in);
     System.out.println("");
     a=sc.nextInt();
     for(i=0;i<=a;i++)
     {
        b=b+i;
     }
       System.out.println(b);
  }
}
