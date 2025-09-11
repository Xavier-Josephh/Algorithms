class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
       for (int i=1; i < nums.length; i++) {
        sum += nums[i];
        if (sum <= 0) {
            sum = nums[i] > sum ? nums[i] : 0;
        }

        if (sum < nums[i]) {
            sum = nums[i];
        }


        if (sum > max) {
            max = sum;
        }
       }
       return max;
    }
}
