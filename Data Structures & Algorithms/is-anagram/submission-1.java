class Solution {
    // TC -> O(n+m), SC -> O(1);
    public boolean isAnagram(String s, String t) {
        int n = s.length(), m = t.length();
        if(n != m) return false;
        var map1 = new HashMap<Character, Integer>();
        var map2 = new HashMap<Character, Integer>();
        for(int i=0;i<n;i++){
            char a = s.charAt(i), b = t.charAt(i);
            map1.put(a, map1.getOrDefault(a, 0) + 1);
            map2.put(b, map2.getOrDefault(b, 0) + 1);
        }
        return map1.equals(map2);
    }
}
