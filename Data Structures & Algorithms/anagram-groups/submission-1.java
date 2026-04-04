class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i < strs.length; i ++) {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            map.computeIfAbsent(new String(charArr), k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
