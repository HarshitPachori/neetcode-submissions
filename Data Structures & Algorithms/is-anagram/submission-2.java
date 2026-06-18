class Solution {
    // TC -> O(n+m), SC -> O(1);
    public boolean isAnagram(String s, String t) {
        int n = s.length(), m = t.length();
        if(n != m) return false;
        var freq = new int[26];
        for(int i=0;i<n;i++){
            char a = s.charAt(i), b = t.charAt(i);
            freq[a - 'a']++;
            freq[b - 'a']--;
        }
        for(int num : freq){
            if(num != 0) return false;
        }
        return true;
    }
}
