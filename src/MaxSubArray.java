/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has
the largest sum and return its sum.



 */

public class MaxSubArray {

    public static int maxSubArray(int[] nums) {
        int max_sum=nums[0];
        int current_sum=max_sum;
        // using kadane's algorithm with O(n) complexity
        // can be done via brute forec but this is more like DP.

        for(int i=1; i<nums.length;i++){
            current_sum=Math.max(nums[i]+current_sum,nums[i]);
            max_sum=Math.max(current_sum,max_sum);
        }
        return max_sum;
    }
    public static void main(String args[])
    {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
        System.out.println("Maximum contiguous sum is " +
                maxSubArray(nums));
    }
}
