package assignment;

import java.util.Scanner;

public class ArrComp {

	public static int[] compTriplets (int a[],int b[])
	{
		 int c[]=new int [2];
         for(int i=0;i<3;i++)
         {
             if(a[i]>b[i])
                 c[0]++;
             else if(a[i]<b[i])
                  c[1]++;  
         }
         return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a[] = new int [3];
        int b[] = new int [3];
        for(int i=0;i<3;i++)
        	a[i]=sc.nextInt();
        for(int i=0;i<3;i++)
        	b[i]=sc.nextInt();
        int c[] =new int[2];
        c = compTriplets(a,b);
        System.out.println(c[0]+" "+c[1]);
	}

}
