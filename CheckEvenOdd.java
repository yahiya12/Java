import java.util.Scanner;

public class CheckEvenOdd
{
  public static void main(String args[])
  {
    int y;
    System.out.println(" ");
    Scanner input = new Scanner(System.in);
    y = input.nextInt();
    if(y<0)
    {
    System.out.println("Invalid");
    }
    else if(y%2==0)
    {
    System.out.println("Even");
    }
    else
    {
        System.out.println("Odd");
    }
  }
}
