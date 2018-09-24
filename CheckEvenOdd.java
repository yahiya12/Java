import java.util.Scanner;

public class CheckEvenOdd
{
  public static void main(String args[])
  {
    int e;
    System.out.println(" ");
    Scanner input = new Scanner(System.in);
    e = input.nextInt();
    if(e<0)
    {
    System.out.println("Invalid");
    }
    else if(e%2==0)
    {
    System.out.println("Even");
    }
    else
    {
        System.out.println("Odd");
    }
  }
}
