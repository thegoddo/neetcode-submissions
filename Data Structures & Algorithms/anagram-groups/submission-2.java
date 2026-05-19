class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> anagramGroup = new HashMap<>();

       for(String str: strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            if(!anagramGroup.containsKey(key)) anagramGroup.put(key, new ArrayList<>());

            anagramGroup.get(key).add(str);
       }

       return new ArrayList<>(anagramGroup.values());
    }
}
