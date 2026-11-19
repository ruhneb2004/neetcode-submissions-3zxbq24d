class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(len(s) != len(t)):
            return False;

        countS = {}
        for i in range(len(s)):
            countS[s[i]] = countS.get(s[i], 0) + 1;
        for c in t:
            if c not in countS or countS[c] < 1:
                return False;
            else:
                countS[c] -= 1;
        return True;