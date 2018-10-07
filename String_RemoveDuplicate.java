import java.util.*;
public class RemoveDuplicate
{
    public static void main(String args[])
    {
	String s,ans="";
	char ch1,ch2;
	int l,i=0;
	Scanner sc=new Scanner(System.in);
        System.out.print("Enter any string: "); /
        s = sc.nextLine();
	l=s.length();
	s+=" ";			 
	ch1=s.charAt(0);	
	while(i<l)
	{			 
		ans= ans+ ch1;  

		while(ch1==(ch2=s.charAt(++i)) && i<l)
		{}
	ch1=ch2;	
	}

	System.out.println("String after removing repeated characters : \n"+ans); 
	}
    }
