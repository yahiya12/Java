import java.util.Scanner;
class Vowels
 {
  public static void main(String[] args)
   {
     int i=0;
    char a;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the alphabit");
    a=s.next().charAt(0);
    switch(a)
    {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
      i++;
    }
     if(i==1)
     {
       System.out.println("alphabit  is vowle");
     }
     else if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
     {
      System.out.println("alphabit  is consonant");
     }
     else 
     {
        System.out.println("invalid");
     }
 }
}
