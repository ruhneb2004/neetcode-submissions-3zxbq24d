class Solution:
    def maxArea(self, heights: List[int]) -> int:
        h = heights
        l = len(h)
        s = 0
        e = l - 1
        m = 0
        while s < e:
            if h[s] < h[e]:
                m = max(m, (e - s) * h[s])
                s += 1
            else:
                m = max(m, (e - s) * h[e])
                e -= 1
        return m