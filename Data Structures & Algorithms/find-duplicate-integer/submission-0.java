class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(numSet.contains(nums[i])) return nums[i];

            numSet.add(nums[i]);
        }
        return -1;
    }
}
