class Solution {
    // TC -> O(nlogn) , SC -> O(1)
    public boolean isAnagram(String s, String t) {
        int n = s.length(), m = t.length();
        if(n != m) return false;
        var str1 = s.toCharArray();
        var str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        for(var i=0;i<n;i++){
            if(str1[i] != str2[i]) return false;
        }
        return true;
    }
}
