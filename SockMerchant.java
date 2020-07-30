

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
          int i,c=0,flag=1;
          Arrays.sort(ar, 0, ar.length);
          for(i=0;i<ar.length-1;i+=2)
          {
              if(flag==1)
              {
                  if(ar[i]==ar[i+1])
                      c++;
                  else
                      flag=0;
              }
              else
              {
                  if(ar[i]==ar[i-1])
                      c++;
                  else
                  {
                      if(ar[i]==ar[i+1])
                      {
                          c++;
                          flag=1;
                      }
                      else
                          flag=0;
                  }
              }
          }
          return c;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
