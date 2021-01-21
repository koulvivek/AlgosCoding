package hr;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SalesByMatch {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int num_pairs=0;
        // retun 0 pairs of array length is 0
        if(ar.length == 0) {
            return num_pairs;
        }
        // create a set and check if the element in  the arrays is not in the set
        // if its not , then add it to the set and if it is then we have a pair match..
        Set<Integer> set= new HashSet<>();
        for(int i=0; i<ar.length;i++){
            if(!set.contains(ar[i])){
                set.add(ar[i]);
            }
            else{
                num_pairs++;
                set.remove(ar[i]);
            }
        }
        return num_pairs;
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

