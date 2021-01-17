/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has
the largest sum and return its sum.



 */

public class MaxSubArray {

    public static int maxSubArray(int[] nums) {

        // current sum..
        int csum=nums[0];
        // overall sum
        int osum= nums[0];
        // using kadane's algorithm with O(n) complexity
        // can be done via brute forec but this is more like DP.
        // attach to the previous sequence if its greater than greater than you otherwise forma  new sequence

        for(int i=0;i<nums.length;i++){
            if(csum >= 0){
                csum +=nums[i];
            }
            else{
                csum=nums[i];
            }
            if(csum > osum){
                osum=csum;
            }
        }
    return osum;
    }
    public static void main(String args[])
    {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
        System.out.println("Maximum contiguous sum is " +
                maxSubArray(nums));
    }
}
