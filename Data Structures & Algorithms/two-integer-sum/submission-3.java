class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;

        for(int num : nums) {
            int comp = target - num;
            if(map.containsKey(comp)) return new int[] {map.get(comp), i};
            map.put(num, i);
            i ++;
        }
        return new int[2];
    }
}