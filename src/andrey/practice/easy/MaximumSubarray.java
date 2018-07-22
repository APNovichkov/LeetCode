package andrey.practice.easy;

import java.util.HashMap;

public class MaximumSubarray {

	public static void main(String[] args) {
		int[] nums = {};

		System.out.println("The biggest sum of a subArray is: " + maxSubArray(nums));
	}

	
	public static int maxSubArray(int[] nums) {
        int sumOfCurrentSet = 0;
        int sumOfPreviousSet = 0;
        int maxSum = nums[0];
        
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        
        for(int i = 0; i < nums.length; i++) {
        		for(int j = 0; j < i+1; j++) {
        			for(int k = j; k < nums.length-i+j; k++) {
        				sumOfCurrentSet+=nums[k];
        				System.out.print(nums[k]);
        			}
        			System.out.println();
        			System.out.println("Sum of current set is: " + sumOfCurrentSet);
        			System.out.println("Sum of previous set is: " + sumOfPreviousSet);
        			
        			if(sumOfCurrentSet > maxSum) {
        				System.out.println("I have set maxSum to: " + sumOfCurrentSet);
        				maxSum = sumOfCurrentSet;
        			}
        			
        			sumOfPreviousSet = sumOfCurrentSet;
        			sumOfCurrentSet = 0;
        		}
        		System.out.println("NEW ITERATION OF i");
        }
		
    	return maxSum;
    }
	
	public static int factorial(int num) {
		int factorial = 0;
		for(int i = 1; i <= num; i++) {
			factorial += i;
		}
			
		return factorial;
	}
}
