/*
 *Rotate an array of n elements to the right by k steps.
 *For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 *Note:
 *Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        for(int i = 0, j = nums.length-1; i < j; i++, j--){
            swap(nums, i, j);
        }
        for(int i = 0, j = k%nums.length-1; i < j; i++, j--){
            swap(nums, i, j);
        }
        for(int i = k%nums.length, j = nums.length-1; i < j; i++, j--){
            swap(nums, i, j);
        }
    }
    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
