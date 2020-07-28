package assignment;

import java.util.Scanner;

public class Grade {
	
	static int[] gradingStudents(int grade[])
	{
		for(int i=0;i<grade.length;i++)
        {
        	if(grade[i]>=38)
        	{
        		if(grade[i]%5 >=3)
        		{
        			grade[i]=(grade[i]/5+1)*5;
        		}
        	}
        }
		return grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt(),i;
        int grade[]=new int [n];
        for( i=0;i<n;i++)
        {
        	grade [i] = sc.nextInt();
        }
        grade =gradingStudents(grade);
        for(i=0;i<n;i++)
        	System.out.println(grade[i]);
	}

}
