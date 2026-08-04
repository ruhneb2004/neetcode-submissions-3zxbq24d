class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = sorted(nums)
        a = []
        l = len(n)
        for i in range (l - 1):
            if i > 0 and n[i] == n[i - 1]:
                continue
            t = - n[i]
            j = i + 1
            k = l - 1
            while(j < k):
                tempT = n[j] + n[k]
                if tempT < t:
                    j = j + 1
                elif tempT > t:
                    k = k - 1
                else:
                    a.append([n[i], n[j], n[k]])
                    j = j + 1
                    k = k - 1

                    while j < k and n[j] == n[j - 1]:
                        j += 1
                    while j < k and n[k] == n[k + 1]:
                        k -= 1
        return a
