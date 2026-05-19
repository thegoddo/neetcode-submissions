class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.isEmpty() || t.isEmpty()) {
            return false;
        }

        int[] sFreq = new int[26];
        int[] tFreq = new int[26];

        for(char c: s.toCharArray()) {
            int index = c - 'a';
            sFreq[index]++;
        }

        for(char c: t.toCharArray()) {
            int index = c-'a';
            tFreq[index]++;
        }

        return Arrays.equals(sFreq, tFreq);
    }
}
