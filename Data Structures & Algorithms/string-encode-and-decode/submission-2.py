class Solution:

    def encode(self, strs: List[str]) -> str:
        r = ""
        for s in strs:
            r += str(len(s)) + "#" + s
        return r

    def decode(self, s: str) -> List[str]:
        l = ""
        r, i = [], 0
        while i < len(s):
            if s[i] == "#":
                r.append(s[i + 1:i + 1 + int(l)])
                i += int(l) + 1
                l = ""
                continue
            l += s[i]
            i += 1

        return r
            
