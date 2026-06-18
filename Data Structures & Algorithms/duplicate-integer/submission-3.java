class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        var set = new HashSet<Integer>();
        for(int i=0;i<n;i++){
            int num = nums[i];
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}