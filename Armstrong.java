public class Armstrong{  
  public static void main(String[] args)  {  
    int y=0,a,temp;  
    int num=153;  
    temp=num;  
    while(num>0)  
    {  
    a=num%10;  
    num=num/10;  
    y=y+(a*a*a);  
    }  
    if(temp==y)  
    System.out.println("yes");   
    else  
        System.out.println("No");   
   }  
}  
