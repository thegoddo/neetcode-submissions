class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                int index = map.get(target - nums[i]);
                int jIndex = i;

                result[0] = index;
                result[1] = jIndex; 
            } else {
                map.put(nums[i], i);
            }
        }

        return result;
    }
}
