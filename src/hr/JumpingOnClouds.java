package hr;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    /*
    For each game, you will get an array of clouds numbered  if they are safe or  if they must be avoided.
    Function Description
Complete the jumpingOnClouds function in the editor below.
jumpingOnClouds has the following parameter(s):
int c[n]: an array of binary integers
Returns
int: the minimum number of jumps required
Approach:

Look out for 1's and single steps
If
"1" is present 2 elements away from i OR you are at the 2nd last step
then increment i by 1 and jump count by1
else
increment by i by 2 and count by 1.

     */
    static int jumpingOnClouds(int[] c) {
    int num_jumps=0;
    int i=0;
    //

        while(i<c.length-1){
            if( i+2 == c.length || c[i+2] == 1 ){
                i++;
                num_jumps++;
            }
            else{
                i+=2;
                num_jumps++;
            }
        }


    return num_jumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

