import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DayOfTheProgrammer {

    // Complete the dayOfProgrammer function below.
    static boolean leap(int year)
    {
        if(year%400==0)
            return true;
        else if(year%4==0 && year%100!=0)
            return true;
        else 
            return false;

    }
    static String dayOfProgrammer(int year) {
          int day=0;
          int month=0;
          if(year > 1918)
          {
              if(leap(year))
              {
                    day=256-244;
                    month=9;
              }
              else
              {
                  day=256-243;
                  month=9;
              }
          }
          else if(year<1918)
          {
              if(year%4==0)
              {
                    day=256-244;
                    month=9;
              }
              else
              {
                  day=256-243;
                  month=9;
              }
          }
          else
          {
              day=256-230;
              month=9;
          }
          String m =String.format("%02d",month);
          return day+"."+m+"."+year;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
