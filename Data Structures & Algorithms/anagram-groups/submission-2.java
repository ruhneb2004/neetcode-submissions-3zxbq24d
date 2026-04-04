class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i < strs.length; i ++) {
            int[] count = new int[26];
            for(char c: strs[i].toCharArray()) {
                count[c - 'a'] ++;
            }
            map.computeIfAbsent(Arrays.toString(count), key -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
