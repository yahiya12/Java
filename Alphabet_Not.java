import java.util.Scanner;

public class Alphabet_Not
{
    public static void main(String args[])
    {
     char m;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        m = scan.next().charAt(0);
	    if((m>='a' && m<='z') || (m>='A' && m<='Z'))
        {
            System.out.print( "Alphabet");
        }
        else
        {
            System.out.print("Not");
        }
    }
}
