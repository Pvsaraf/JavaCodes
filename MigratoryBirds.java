package assignment;

import java.util.Scanner;

public class MigratoryBirds {
	
	public static int migratoryBirds(int arr[])
	{
		int cmax=0;
		int min;
		int c[]= new int [5];
		for(int i=0;i<arr.length;i++)
		{
			
			switch(arr[i])
			{
			    case 1:c[0]++;
			           break;
			    case 2:c[1]++;
		               break;   
			    case 3:c[2]++;
	                   break;   
			    case 4:c[3]++;
	                   break;   
			    case 5:c[4]++;
	                   break;   
			    default:System.out.println("Invalid input:");
			}
			
		}
		cmax=c[0];
		min=1;
		for(int i=1;i<5;i++)
		{
			if(c[i]>cmax)
			{
				cmax=c[i];
				min=i+1;
			}
			else if(c[i]==cmax)
			{
				if(i+1<min)
					min=i+1;
			}
				
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),i;
		int arr[] = new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
        System.out.println(migratoryBirds(arr));
	}

}
