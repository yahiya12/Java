import java.util.Scanner;
public class Larger_number
{
    public static void main(String[] args) 
    {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print(" ");
        a = sc.nextInt();
        System.out.print(" ");
        b = sc.nextInt();
        System.out.print(" ");
        c = sc.nextInt();
        if(a > b && a > c)
        {
            System.out.println("Largest number is:"+a);
        }
        else if(b > c)
        {
            System.out.println("Largest number is:"+b);
        }
        else
        {
            System.out.println("Largest number is:"+c);
        }
 
    }
}