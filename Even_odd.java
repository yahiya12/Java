import java.util.Scanner;

public class Even_odd
{
  public static void main(String args[])
  {
    int num;
    System.out.println(" ");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    if(num<0)
    {
    System.out.println("Invalid");
    }
    else if(num%2==0)
    {
    System.out.println("Even");
    }
    else
    {
        System.out.println("Odd");
    }
  }
}
