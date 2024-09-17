package problem_solving.problem_solving.array;

/*
Problem statement: Given an array of integers, return the indices of the two numbers
that add up to a given target.
*/

import java.util.HashMap;

public class TwoSum {


    public int findIndicesO2( int[] nums, int target)
    {
        int numOfPairs = 0;
        for(int k=0; k<nums.length; k++)
        {
            for(int j=0; j<nums.length; j++)
            {
                if(nums[j] == target - nums[k])
                {
                    System.out.println(k + ", " + j);
                    numOfPairs++;
                }
            }
        }
        return numOfPairs/2;
    }

    public int findIndicesOptimized( int[] nums, int target)
    {
        int numOfPairs = 0;

        //Storing pair of(value, index) in the map
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int k=0; k<nums.length; k++){
            map.putIfAbsent(nums[k],k);
        }

        //{1,3,7,9,8,20,4,-9,30}, target=50
        for(int num: nums)
        {
            if((map.get(num) !=null) && (map.get(target - num) != null))
            {
                System.out.println(map.get(num) + ", " + map.get(target - num));
                numOfPairs++;
            }
        }
        return numOfPairs/2;
    }
}
