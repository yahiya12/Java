import java.util.Scanner;
public class Holiday {
	public static void main(String args[])
	{
		Scanner reads = new Scanner(System.in);
		String s;
		s=reads.next().toLowerCase();
		if(s.equals("sunday") || s.equals("saturday")) 
			System.out.println("yes");
		
		else 
			System.out.println("no");
		
	}
}
