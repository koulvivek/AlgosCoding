package hr;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

Approach:


This problem covers 3 scenario's
[2,1,5,3,4]
1)Scenario where you need to swap just 1 index , example we have to swap 2 and 1 in above case.
2) Scenario where you need to swap 2 indices , example 5
3) All the scenario's >2 are too much chaos .

Lets say the array is q[i];
// check till the array is not sorted...
//traverse backwards
if q[i] != i+1
now scenario #1 where we just have to move to just 1 swap .
// we need to check the left bound as well so that we dont end up with negative index and out of bounds.
if((i-1) >=0 && q[i-1] == i+1;
{
swap and increment swap counter
}

else scenario #2
else if ((i-2>0 && q[i-2] == i+1{
swap 3 numbers and increment swap counter by 2.

}

else scenario 3 " Too Much chaos..

 */
public class NewYearChaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {

        int swaps=0;
        // start backwards...
        for(int i=q.length-1;i>=0;i--){

            if (q[i] != i+1){
                // single swap condition or 1 index move
                if((i-1) >=0 && q[i-1] == i+1)
                {
                    int temp=q[i-1];
                    q[i-1]=q[i];
                    q[i]= temp;

                    swaps++;
                }
                // double swap condition or 2 index move
                else if((i-2) >=0 && q[i-2] ==i+1){
                    // swap 3
                    q[i-2]=q[i-1];
                    q[i-1]=q[i];
                    q[i]=q[i-2];

                    swaps+=2;

                }

                else{
                    System.out.println("Too much chaos");
                    return;
                }
            }

            System.out.println(swaps);

        }



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}

