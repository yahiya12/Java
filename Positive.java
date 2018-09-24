
import java.util.Scanner;
public class Positive
{
    public static void main(String[] args) 
    {
        int y;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        y = s.nextInt();
        if(y > 0)
        {
            System.out.println("Positive");
        }
        else if(y < 0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println(" neither Positive nor Negative ");
        }
    }
}