class Solution:
    def maxArea(self, heights: List[int]) -> int:
        h = heights
        l = len(h)
        s = 0
        e = l - 1
        m = 0
        while s < e:
            m = max(m, min(h[s], h[e]) * (e - s))
            if h[s] < h[e]:
                s += 1
            else:
                e -= 1
        return m