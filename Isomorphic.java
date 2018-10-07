import java.util.Scanner;
public class Isomorphic {
      public static void main(String[] args) {
      int i,n,m=0,temp,k=0;
      String a,b;
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the first string");
      a=scan.nextLine();
      System.out.println("enter the second string");
      b=scan.nextLine();
      n=a.length();
      for(i=0;i<n;i++)
          for(int j=i+1;j<n;j++)
      {
          if(a.charAt(i) == a.charAt(j))
          {
              m=i;
              k=j;
          }
      }
      if(b.charAt(m)==b.charAt(k))
      {
          System.out.println("true");
      }
      else
          System.out.println("false");

    }
 
}
