import java.util.*;

class Palindrome
{
	public static void main (String[] args) 
	{
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
        for(int i=0; i<t; i++)
        {
            int n=sc.nextInt();
            int temp=n;
            int rev=0;
            while(n>0)
            {
                int dig=n%10;
                rev=rev*10+dig;
                n/=10;
            
            }
        System.out.println(rev);
        
        if(temp==rev)
        System.out.println("is a palindrome");
        else
        System.out.println("is not a palindrome");
        }
	}
}