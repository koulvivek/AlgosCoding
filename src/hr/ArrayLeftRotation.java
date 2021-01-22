package hr;
/*

A left rotation operation on an array shifts each of the array's elements 1 unit to the left.
Given an array a of n integers and a number d, ,
perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.

 the solution can be done by

 for an array a[i] and a number d for left rptation

 we create a new array which is left rotated by d such a way that
 arr[i]=[a(i+d) % a.length]

 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayLeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        int[] array = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            array[i] = a[(i + d) % a.length];
        }
        return array;
    }
}