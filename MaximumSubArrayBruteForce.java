package com.algo.practise2;

public class MaximumSubArrayBruteForce {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("main" + "  -> " + nums[i]);
            int sumF = nums[i];
            int sumR = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sumF = sumF + nums[j];
                if (sumF > maxSum) {
                    maxSum = sumF;
                }
                if (nums[j] > maxxSum) {
                    maxSum = nums[j];
                }
                System.out.println(sumF + "  " + nums[j]);
            }
            System.out.println("sumF --------------------->" + sumF);

            for (int k = i - 1; k >= 0; k--) {
                sumR = sumR + nums[k];
                if (sumR > maxSum) {
                    maxSum = sumR;
                }
                if (nums[k] > maxSum) {
                    maxSum = nums[k];
                }
                System.out.println(sumR + "  " + nums[k]);
            }
            System.out.println("sumR ---------------------->" + sumR);
        }
        System.out.println("Max Sum " + maxSum);
    }
}
