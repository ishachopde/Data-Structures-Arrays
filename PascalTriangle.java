//Pascal's trianle 
// Time complexity: O(n^2) Space: O(1)


public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> array = new ArrayList<List<Integer>>();
        
        for (int i=0; i<numRows; i++){
            List<Integer> row =  new ArrayList<Integer>();
            for (int j=0; j<i+1; j++){
                if (j==0 || j==i){
                    row.add(1);
                } else {
                    row.add(array.get(i-1).get(j-1)+array.get(i-1).get(j));
                }
            }
            array.add(row);
        }
        return array;
    }
}