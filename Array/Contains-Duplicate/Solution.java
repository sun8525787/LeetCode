/*Given an array of integers, find if the array contains any duplicates. 
 *Your function should return true if any value appears at least twice in 
 *the array, and it should return false if every element is distinct.*/
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.containsKey(n)) return true;
            else map.put(n, null);
        }
        return false;
    }
}
