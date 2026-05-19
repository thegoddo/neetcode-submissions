class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> dupl = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(dupl.containsKey(nums[i])) {
                return true;
            } else {
                dupl.put(nums[i], i);
            }
        }
        return false;
    }
}