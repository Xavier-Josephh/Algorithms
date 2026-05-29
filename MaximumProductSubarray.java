class Solution {
    public int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int maxProduct = nums[0];
/*Why Do We Swap When the Current Element is Negative?
Core Rule of Multiplication
Operation	Result
Positive × Positive	Positive (larger)
Negative × Negative	Positive (larger)
Positive × Negative	Negative (smaller)
Negative × Positive	Negative (smaller)
The Key Insight
When you multiply by a negative number, the roles of max and min flip:

The largest value becomes the smallest
The smallest value becomes the largest
Simple Example
Suppose at some point:
    maxProd = 6    (best product so far ending here)
    minProd = -8   (worst product so far ending here)

Now, nums[i] = -2 (negative number)
Without swap (WRONG):
maxProd = max(-2, 6 * -2) = max(-2, -12) = -2
minProd = min(-2, -8 * -2) = min(-2, 16) = -2
We missed that -8 × -2 = 16 should be our new maximum!

With swap (CORRECT):
Step 1: Swap because nums[i] < 0
    maxProd = -8
    minProd = 6

Step 2: Now compute
    maxProd = max(-2, -8 * -2) = max(-2, 16) = 16  ✓
    minProd = min(-2, 6 * -2)  = min(-2, -12) = -12 ✓
The most negative value (-8) became the best candidate for maximum when multiplied by a negative number! */
        for (int i=1; i< nums.length; i++) {
            if (nums[i] < 0) {
                int temp = 0; //Swap below and for this explaination above
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
