package hr;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     *
     * steps =5
     * path=[UUUDD]
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int sea_level=0;
        int valley_count=0;
        /*
        here we are trying to validate a valley which is a movement in sea level.
        if we go below sea level and come back to it that would be a valley , steps do not matter.
         */
        if( steps ==0 || path.length()==0){
            return valley_count;
        }
        for(int i=0; i<steps;i++){
            if(path.charAt(i) == 'U'){
                if(sea_level == -1){
                    valley_count++;
                }
                sea_level++;

            }
            if(path.charAt(i) == 'D'){
                sea_level--;
            }
        }

    return valley_count;
    }

}

public class CountValleys {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

