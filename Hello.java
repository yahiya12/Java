import java.util.Scanner;
public class Hello {
  public static void main(String[] args)
   {
     int num;
     System.out.print("");
     Scanner s=new Scanner(System.in);
     num=s.nextInt();
     for (int i = 0; i < num; i++)
      {
			System.out.println("Hello");
      }
  }
}
