package assignment;

import java.util.Scanner;

public class PatternStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 if(n<=0)
			 System.out.println("Wrong input(n should be positive),can't create a stair");
		 else
		 {
				 int j;
				 for(int i=1;i<=n;i++)
				 {
					for( j=1;j<=n-i;j++)
						System.out.print(" ");
					int ct=0;
					do {
						System.out.print("# ");
						ct++;
					}while(ct<i);
					System.out.println();
				 }
				
		 }
	}

}
