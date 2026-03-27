class SlidingWindowMaximumBruteForce {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length -k + 1];
        for (int i=0; i < nums.length && nums.length -k + 1 > i; i++) {
            int m = 0;
            int max = nums[i];
            for (int j = i; j< nums.length && m < k; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                }   
                result[i] = max;
                m ++;
            }
        }
        return result;
    }
}
