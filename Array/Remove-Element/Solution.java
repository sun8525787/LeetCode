/*
 *Given an array and a value, remove all instances of that value in place and return the new length.
 *The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int end = nums.length-1;
        for(int i = 0; i <= end; i++){
            if(nums[i] == val){
                nums[i] ^= nums[end];
                nums[end] ^= nums[i];
                nums[i] ^= nums[end];
                end--;
                i--;
            }
        }
        return end+1;
    }
}
