import java.util.*;
import java.util.Arrays;

public class ArraySum {
    public static int addingAColectionOfNumbers(int[] aCollectionOfNumbers){
    int i;
    int sum=0;
    for( i=0;i<aCollectionOfNumbers.length;i++){
        sum=sum+aCollectionOfNumbers[i];

    }
        // Write your code here
        System.out.println("Sum is "+sum);
        return sum;
    }

    public static void main(String[] args){
        int []arr = {20, 10, 3};
        addingAColectionOfNumbers(arr);
    }
}
