import java.util.Scanner;

public class DiagDiff {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
//		System.out.println("Enter the number of rows and columns:");
		
		int n =sc.nextInt(),i;
		int a[][]=new int [n][n];
		for( i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int s1=0,s2=0;
		for(i=0;i<n;i++)
		{
			s1+=a[i][i];
			s2+=a[i][n-i-1];
		}
		System.out.println(s1>s2?s1-s2:s2-s1);
		
	}

}
