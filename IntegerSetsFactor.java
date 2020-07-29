package assignment;

import java.util.Scanner;

public class IntegerSetsFactor {
	
	public static int gcd(int a ,int b)
	{
		int temp=1;
		for(int i=1;i<=Math.min(a, b);i++)
		{
			if(a%i==0 && b%i==0)
				temp=i;
		}
		return temp;
	}
	
	public static int lcm(int a,int b)
	{
		return a*b/gcd(a,b);
	}
	
	public static int getTotalX(int a[],int b[])
	{
		int g=b[0],l=1;
		for(int i=0;i<a.length;i++)
		{
			l=lcm(a[i],l);
		}
		for(int i=0;i<b.length;i++)
		{
			g=gcd(g,b[i]);
		}
		if(g%l==0)
		{
			int c=0;
			for(int i=1;i<=g/l;i++)
			{
				if(g%(l*i)==0)
					c++;
			}
			return c;
		}
		else
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),i;
        int m = sc.nextInt();
        int []a =new int [n];  
        int []b =new int [m];  
        for( i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        for( i=0;i<m;i++)
        {
        	b[i]=sc.nextInt();
        }
        System.out.println(getTotalX(a,b));
	}

}
