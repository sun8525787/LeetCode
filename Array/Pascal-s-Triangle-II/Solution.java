/*
 *Given an index k, return the kth row of the Pascal's triangle.
 *For example, given k = 3,
 *Return [1,3,3,1].
 *Note:
 *Could you optimize your algorithm to use only O(k) extra space?
 */

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex+1);
        for(int i = 1; i < rowIndex+2; i++){
            int pre = 1;
            for(int j = 0; j < i; j++){
                if(i == 1) result.add(1);
                else if(j == 0) result.set(0, 1);
                else if(j == i-1) result.add(1);
                else{
                    int tmp = result.get(j);
                    result.set(j, pre+tmp);
                    pre = tmp;
                }
            }
        }
        return result;
    }
}
