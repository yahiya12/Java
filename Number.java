import java.util.Scanner;
public class Number{
    public static void main(String args[]){
        int yahicount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        while(num!=0)
        {
        num/=10;
        ++yahicount;
        }
        System.out.println("Number of Digits:  " +yahicount);
        
}
}

