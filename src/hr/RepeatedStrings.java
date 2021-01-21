package hr;
/*
There is a string s, , of lowercase English letters that is repeated infinitely many times. Given an integer n, ,
find and print the number of letter a's in the first n letters of the infinite string.

Sample Input

s=aba
n=10
Sample Output
7
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedStrings {

    // Complete the repeatedString function below.
    /*
    Number of A's= number of A's in the string * Total full strrings + Remainder strings.
     */
    static long repeatedString(String s, long n) {
    long total_full_strings= n / s.length();
    long remainder= n % s.length();
    long count_a=0;
    //converting string to char array

        char[] c= s.toCharArray();
        // count of A's in existing string
        for(int i=0;i<s.length();i++)
        {
            if(c[i]=='a'){
                count_a++;
            }
        }

        count_a=count_a*total_full_strings;

        // remiander string
        for(int i=0; i<remainder;i++){
            if(c[i]=='a'){
                count_a++;
            }
        }
    // return overall count..
    return count_a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
