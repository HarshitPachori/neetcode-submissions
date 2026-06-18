class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        var map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            int num = nums[i];
            if(map.containsKey(num)) return true;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}