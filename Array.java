import java.util.Scanner;
public class Array
{
  public static void main(String[] args) 
  {
    
       int K,c=0;
        Scanner s=new Scanner(System.in);
        System.out.println("size");
        int size =s.nextInt();
        int[] N =new int[size];
        if(size!=0)
        {
        System.out.println("elements");
        for(int i=0;i<N.length;i++)
        {
        N[i]=s.nextInt();
        }
        System.out.println("how much number to add");
         K=s.nextInt();
        System.out.println("c");
        for(int i=0;i<K;)
         {
            c=c+N[i];
            i++; 
         }
         System.out.println(c);
       }
  }
}
