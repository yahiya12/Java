import java.util.Scanner;
 
public class Even{
 
    public static void main(String []args)
    {
        int n=0,e=0;
         
        Scanner Y = new Scanner(System.in);
         
        System.out.print("Enter value n : ");
        n = Y.nextInt();
         
        for(e=1; e<n; e++)
        {
            if(e%2==0)
                System.out.print(e+" ");
        }   
        System.out.println();
         
    }
}
