class Solution {
   // TC -> O(n) , SC -> O(n)
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        var map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            int num1 = nums[i];
            int num2 = target - num1;
            if(map.containsKey(num2)) return new int[]{map.get(num2), i};
            map.put(num1, i);
        }
        return new int[]{};
    }
}
