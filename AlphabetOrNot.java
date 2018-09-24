import java.util.Scanner;

public class AlphabetOrNot
{
    public static void main(String args[])
    {
     char cha;
        Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a Character : ");
        cha = scan.next().charAt(0);
	    if((cha>='a' && cha<='z') || (cha>='A' && cha<='Z'))
        {
            System.out.print(ch + " is an Alphabet");
        }
        else
        {
            System.out.print(ch + " is not an Alphabet");
        }
    }
}
