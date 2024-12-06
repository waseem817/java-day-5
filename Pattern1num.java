import java.util.*;
/*
0 1 2 3 4 5 
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
*/
class Pattern
{
	public static void main (String[] args) 
	{
	    Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
	    {
		    for(int j=i;j<=n;j++)
		    {
			    System.out.print(j+" ");
		    }
		    System.out.println();
        }
    }
}
