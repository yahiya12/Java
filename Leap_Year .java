import java.util.Scanner;
public class Leap_Year 
{
    public static void main(String args[])
    {
        int yr;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any year:");
        yr = scan.nextInt();
        boolean flag = false;
        if(yr % 400 == 0)
        {
            flag = true;
        }
        else if (yr % 100 == 0)
        {
            flag = false;
        }
        else if(yr % 4 == 0)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        if(flag)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("not a Leap Year");
        }
    }
}
