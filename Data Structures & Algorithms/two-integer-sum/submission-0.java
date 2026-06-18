class Solution {
    // TC -> O(n^2) , SC -> O(1)
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int num1 = nums[i];
            for(int j=i+1;j<n;j++){
                int num2 = nums[j];
                if(num2 == (target - num1)){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
