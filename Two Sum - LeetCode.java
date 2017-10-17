/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

*/

import java.util.Hashtable;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable array = new Hashtable();
        int[] result = new int[2];
        
        
        for(int i=0; i<nums.length;i++){
            if(array.containsKey(nums[i])){
                result[0] = (int)array.get(nums[i]);
                result[1] = i;
                break;
            }else{
                array.put(target - nums[i],i);
            }
        }
        return result;
        
        
    }
}