class Solution {
    public int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int maxProduct = nums[0];

        for (int i=1; i< nums.length; i++) {
            if (nums[i] < 0) {
                int temp = 0;
                temp = minSoFar;
                minSoFar = maxSoFar;
                maxSoFar = temp;
            } 

            maxSoFar = Math.max(nums[i], nums[i] * maxSoFar);
            minSoFar = Math.min(nums[i], nums[i] * minSoFar);

            maxProduct = Math.max(maxSoFar, maxProduct);
        }

        return maxProduct;
    }
}
