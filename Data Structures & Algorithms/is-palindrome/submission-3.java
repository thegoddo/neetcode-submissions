class Solution {
    public boolean isPalindrome(String s) {
        String sc = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l = 0;
        int r = sc.length() - 1;

        while(l < r) {
            if(sc.charAt(l) == sc.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }

        return true;
    }
}
