class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();

        for(int num: nums) {
            numSet.add(num);
        }
        int currentNum = 0;
        int currentLength = 0;
        int maxLength = 0;
        for(int num: nums) {

            if(!numSet.contains(num - 1)) {
                currentNum = num;
                currentLength = 1;

                while(numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }

        }

        return maxLength;
    }
}
