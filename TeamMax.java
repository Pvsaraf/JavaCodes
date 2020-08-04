import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TeamMax {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {

        int ct[]=new int [2];
        int sum=0,max=0;
        
            for(int i=0;i<topic.length;i++)
            {
                
                for(int k=i+1;k<topic.length;k++)
                {
                    sum=0;
                    for(int j=0;j<topic[0].length();j++)
                    {
                        if(topic[i].charAt(j)=='1'||topic[k].charAt(j)=='1')
                        {
                        sum++;
                        }
                    }
                    if(sum>max)
                    {
                        max=sum;
                        ct[0]=max;
                        ct[1]=1;
                    }
                    else if(sum==max)
                        ct[1]++;
                    
                
                            

                }

            }   
        
        return ct;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
