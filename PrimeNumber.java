import java.util.Scanner; 
public class PrimeNumber 
{ 
                public static void main(String args[]) 
             { 
                  int num,n,o; 
                  Scanner scan=new Scanner(System.in); 
                  System.out.println("Enter A Number"); 
                  tin =scan.nextInt(); 
                  n=1; 
                  o=0; 
                   while(n<= tin) 
                      { 
                          if((tin%n)==0) 
                             o=o+1; 
                             n++; 
                      } 
                       if(o==2) 
                       System.out.println(tin +" is a prime number"); 
                       else 
                       System.out.println(tin +" is not a prime number"); 
             } 
} 
