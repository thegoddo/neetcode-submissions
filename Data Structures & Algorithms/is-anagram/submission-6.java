class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        int[] b = new int[26];

        for (char c: s.toCharArray()) {
            a[c - 'a']++;
        }

        for(char c: t.toCharArray()) {
            b[c - 'a']++;
        }

        return Arrays.equals(a, b);
    }
}
