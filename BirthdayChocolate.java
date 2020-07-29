package assignment;

import java.util.Scanner;

public class BirthdayChocolate {
	
	public static int birthday(int s[],int d, int m)
	{
		int c=0;
		if(s.length==m)
		{
			int sum=0;
			for(int i=0;i<s.length;i++)
				sum+=s[i];
			if(sum==d)
				return 1;
			else
				return 0;
		}
		else if(s.length<m)
			return 0;
		for(int i=0;i<=s.length-m;i++)
		{
			int sum=0;
			
			for(int j=i;j<i+m;j++)
				sum+=s[j];
			if(sum==d)
				c++;
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        int s[] =new int [n];
        for(int i=0;i<n;i++)
        {
        	s[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(birthday(s,d,m));
   
	}

}
