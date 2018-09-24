import java.util.Scanner;
public class Postive_Negative 
{
    public static void main(String[] args) 
    {
        int y;
        Scanner s = new Scanner(System.in);
        System.out.print(" ");
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
            System.out.println("Zero");
        }
    }
}
