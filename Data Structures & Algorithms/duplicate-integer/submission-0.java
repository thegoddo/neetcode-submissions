
class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicate = false;
        
        HashSet<Integer> mySet = new HashSet<Integer>();

        for(int num: nums) {
            if(!mySet.add(num)) {
                duplicate = true;
            }
        }

        return duplicate;
    }
}
