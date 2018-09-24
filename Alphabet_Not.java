import java.util.Scanner;

public class Alphabet_Not
{
    public static void main(String args[])
    {
     char cha;
        Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a Character : ");
        cha = scan.next().charAt(0);
	    if((cha>='a' && cha<='z') || (cha>='A' && cha<='Z'))
        {
            System.out.print( "Alphabet");
        }
        else
        {
            System.out.print("Not");
        }
    }
}
