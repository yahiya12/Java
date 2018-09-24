import java.util.Scanner;
public class Larger_number
{
    public static void main(String[] args) 
    {
        int l, m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print(" ");
        l = sc.nextInt();
        System.out.print(" ");
        m = sc.nextInt();
        System.out.print(" ");
        n = sc.nextInt();
        if(l > m && l > n)
        {
            System.out.println("Largest number is:"+l);
        }
        else if(m > n)
        {
            System.out.println("Largest number is:"+m);
        }
        else
        {
            System.out.println("Largest number is:"+n);
        }
 
    }
}
