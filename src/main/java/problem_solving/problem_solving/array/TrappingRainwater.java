package problem_solving.problem_solving.array;


public class TrappingRainwater {

    /*
    Given n non-negative integers representing an elevation map where the width of each
    bar is 1, compute how much water it can trap after raining.
     */
    public int getTrappedRainwater(int[] nums){
        //const elevationArray = [0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2]
        int totalWater = 0;

        for(int p=0; p<nums.length; p++){
            int leftp=p, rightp=p, leftMax=0, rightMax=0;

            while(leftp >=0)
            {
                leftMax = Math.max(leftMax, nums[leftp]);
                leftp--;
            }

            while(rightp < nums.length)
            {
                rightMax = Math.max(rightMax, nums[rightp]);
                rightp++;
            }

            int currentTrappedWater = Math.min(leftMax, rightMax) - nums[p];

            if(currentTrappedWater > 0)
                totalWater += currentTrappedWater;
        }

        return totalWater;
    }

    /*
    1. Identify the pointer with the lesser value
    2. Is this pointer value greater than or equal to max on that side
        yes -> update max on that side
        no -> get water for pointer, add to total
    3. move pointer inwards
    4. repeat for other pointer
    */
    public int getTrappedRainwaterOptimized(int[] heights){
        //const elevationArray = [0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2]

        int left = 0, right = heights.length - 1, totalWater = 0, maxLeft = 0, maxRight = 0;

        while(left < right) {
            if(heights[left] <= heights[right]) {
                if(heights[left] >= maxLeft) {
                    maxLeft = heights[left];
                } else {
                    totalWater += maxLeft - heights[left];
                }
                left++;
            } else {
                if(heights[right] >= maxRight) {
                    maxRight = heights[right];
                } else {
                    totalWater += maxRight - heights[right];
                }
                right--;
            }
        }
        return totalWater;
    }
}
