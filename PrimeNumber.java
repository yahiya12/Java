import java.util.Scanner; 
public class PrimeNumber 
{ 
                public static void main(String args[]) 
             { 
                  int num,b,c; 
                  Scanner scan=new Scanner(System.in); 
                  System.out.println("Enter A Number"); 
                  tin =scan.nextInt(); 
                  b=1; 
                  c=0; 
                   while(b<= tin) 
                      { 
                          if((tin%b)==0) 
                             c=c+1; 
                             b++; 
                      } 
                       if(c==2) 
                       System.out.println(tin +" is a prime number"); 
                       else 
                       System.out.println(tin +" is not a prime number"); 
             } 
} 
