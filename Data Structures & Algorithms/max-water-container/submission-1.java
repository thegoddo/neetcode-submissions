class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int output = 0;
        while(l < r) {
            int currentOutput = (r - l) * Math.min(heights[l], heights[r]);
            output = Math.max(output,currentOutput);
            if (heights[l] > heights[r]) {
                r--;
            } else{
                l++;
            }

        }
        return output;
    }
}
