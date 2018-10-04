import java.util.Scanner;
 
public class FactorialPlayer
{
   public static void main(String args[])
   {
      int h, z, fact = 1;
     
      System.out.println("Enter an integer to calculate it's factorial");
      Scanner in = new Scanner(System.in);
     
      h = in.nextInt();
     
      if (h < 0)
         System.out.println("Number should be non-negative.");
      else
      {
         for (z = 1; z <= h; z++)
            fact = fact*z;
     
         System.out.println("Factorial of "+h+" is = "+fact);
      }
   }
}
