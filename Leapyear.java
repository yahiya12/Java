import java.util.Scanner;
public class Leapyear
{
  public static void main(String[] args) 
{
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the year");
    num=sc.nextInt();
    if (num%4==0)
    {
      System.out.println("leap year");
    }
    else
    {
      System.out.println("not");
    }
  }
}
