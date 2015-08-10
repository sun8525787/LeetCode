/*
 *Given numRows, generate the first numRows of Pascal's triangle.
 *For example, given numRows = 5,
 *Return
 *[
       [1],
      [1,1],
     [1,2,1],
    [1,3,3,1],
   [1,4,6,4,1]
 *]
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows == 0) return result;
        for(int i = 1; i <= numRows; i++){
            List<Integer> curr = new ArrayList<>();
            for(int j = 0; j < i; j++){
                if(j == 0) curr.add(1);
                else if(j == i-1) curr.add(1);
                else{
                    List<Integer> pre = result.get(i-2);
                    curr.add(pre.get(j-1)+pre.get(j));
                }
            }
            result.add(curr);
        }
        return result;
    }
}
