import java.util.Scanner;

public class ReversePlayer
{
	public static void main(String[] args)
	{
		System.out.println(" ");
		
		Scanner xy = new Scanner(System.in);
		String str = xy.nextLine();
		String reverse = " ";
		
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println(" ");
		System.out.println(reverse);
	}
}
