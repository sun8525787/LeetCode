/*
 *Given a non-negative number represented as an array of digits, plus one to the number.
 *The digits are stored such that the most significant digit is at the head of the list.
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> result = new ArrayList<>();
        int carrier = 1;
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i]+carrier == 10){
                result.add(0, 0);
                carrier = 1;
            }else{
                result.add(0, digits[i]+carrier);
                carrier = 0;
            }
        }
        if(carrier == 1) result.add(0,carrier);
        int[] num = new int[result.size()];
        for(int i = 0; i < result.size(); i++)
            num[i] = result.get(i);
        return num;
    }
}
