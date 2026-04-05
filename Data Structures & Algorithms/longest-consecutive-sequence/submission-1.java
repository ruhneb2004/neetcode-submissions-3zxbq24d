class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        int ans = 0;

        for(int num: nums) set.add(num);
        
        for(int num: set) {
            if(set.contains(num - 1)) continue;
            count ++;
            int i = 0;
            while(set.contains(num + ++i)) count++;
            ans = Math.max(count,ans);
            count = 0;
        }
        return ans;
    }
}
