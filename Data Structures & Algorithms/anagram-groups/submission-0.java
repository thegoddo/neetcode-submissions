class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> aStrMap = new HashMap<>();

        for(String str: strs) {
            char[] charArray = str.toCharArray();

            Arrays.sort(charArray);

            String key = new String(charArray);

            if(!aStrMap.containsKey(key)) aStrMap.put(key, new ArrayList<>());

            aStrMap.get(key).add(str);
        }

        return new ArrayList<>(aStrMap.values());
    }
}
