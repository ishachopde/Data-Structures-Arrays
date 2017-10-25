//Leet code 
//Remove duplicatres from sorted array

class Solution {
    public int removeDuplicates(int[] nums) {
        int i,j=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                
                nums[++j]=nums[i];
                
            }
        }
        return ++j;
    }
}