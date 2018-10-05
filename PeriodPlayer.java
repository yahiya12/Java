import java.util.Scanner;
public class PeriodPlayer{
    public static void main(String args[]){
        String s2,s3;
        Scanner read=new Scanner(System.in);
        System.out.println("Enetr the String: ");
        String str=read.nextLine();
        s2=".";
        s3=str.concat(s2);
        System.out.println(s3);
    }
}
