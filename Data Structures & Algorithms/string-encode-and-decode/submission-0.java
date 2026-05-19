class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> resultList = new ArrayList<>();

        int i = 0;

        while(i < str.length()) {
            int delIndex = str.indexOf("#", i);

            String indexLength = str.substring(i, delIndex);
            int length = Integer.parseInt(indexLength);

            int startIndex = delIndex + 1;
            String content = str.substring(startIndex, startIndex + length);

            resultList.add(content);

            i = startIndex + length;
        }

        return resultList;
    }
}
