class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        int strLen = str.length();
        while(i < strLen) {
            int j = i;
            while(str.charAt(j) != '#') j ++;
            int len = Integer.parseInt(str.substring(i,j));
            i = j + 1;
            j = i + len;
            ans.add(str.substring(i,j));
            i = j;
        }
        return ans;
    }
}
