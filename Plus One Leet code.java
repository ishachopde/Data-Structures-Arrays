// Plus one 

class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int i;
        for( i = digits.length-1;i>=0;i--){
            int sum = digits[i]+carry;
            if(sum>=10){
                carry = 1;
            }
            else{
                carry = 0;
            }
           digits[i]=sum%10;
        }
        
        if(carry ==1){
            int[] result = new int[digits.length+1];
            result[0] =1;
            return result;
        }
        else{
            return digits;
        }
    }
}