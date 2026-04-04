class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<List<Integer>, ArrayList<String>> map = new HashMap<>();


        for(String str : strs) {

            int[] letterArr = new int[26];
            for(char c : str.toCharArray()) {
                letterArr[c - 'a'] += 1;
            }
            ArrayList<Integer> list = new ArrayList<>();

            for(int letterNum : letterArr) {
                list.add(letterNum);
            }

            if(map.containsKey(list)) {
                map.get(list).add(str);
            } else {
                ArrayList<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(list, strList);
            }
        }

        List<List<String>> res = new ArrayList<>(map.values());
        return res;
    }
}
