/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /* brute force solution start 2 for loops with O(n)^2 time complexity, space complexity O(1)
    star with first element loop for i and 2nd element loop for j
    nums[i] and nums[j]

   if nums[j] = target -nums[i] then return i,j indxes
   e.g Input: nums = [2,7,11,15], target = 9
   nums[i] starts with 2 , nums[j] starts with 7
   7=9-2 is true so return indexes of 2 and 7.
    */
    public static int[] twoSumBF(int nums[], int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i = 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }

            }

        }
        throw new IllegalArgumentException("No solution");
    }

    /*
    One pass hash map with TC as O(n) if collision happens otherwise O(1) and SC as O(n)
    Use single for loop to iterate on the elements
    Use HashMap to track the compliment.
    use compliment to track target-nums[i]
    if the compliment is in the map return the i and index of the compliment..otherwise add nums[i] to the map
     */
    public int[] twoSumHash(int nums[], int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No solution");
    }



}