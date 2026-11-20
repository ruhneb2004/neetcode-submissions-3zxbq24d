class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}

        for num in nums:
            count[num] = 1 + count.get(num, 0)
        
        f = [[] for i in range(len(nums) + 1)]
        for key, v in count.items():
            f[v].append(key)

        res = []
        for i in range(len(f) - 1, 0, -1):
            for n in f[i]:
                res.append(n)

                if len(res) == k:
                    return res