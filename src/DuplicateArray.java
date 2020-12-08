/*
Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array,
and it should return false if every element is distinct.
 */


import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

    public static boolean containsDuplicate(int[] nums) {
        // create a has set and check if the number is in the set , if not add the number
        //return true if the number you want to add to set is already present(that means duplicate)
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }
    public static void main(String[] args){
        int []arr = {20, 10, 3,11,12,2};
        boolean output=containsDuplicate(arr);
        System.out.println(output);
    }

}
