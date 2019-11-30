package andrey.practice.easy;

import java.util.HashMap;
import java.util.Arrays;

public class MaximumSubarray {

	public static void main(String[] args) {
		int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums2 = {1,3,4,-5,3,2};
		int[] nums3 = {-1,-3,-4,-6,2};
		int[] nums4 = {-5,3,4,-1};
		int[] nums5 = {1,2,3,4};

		System.out.println("The biggest sum of a subArray is: " + maxSubArray(nums1));
	}

	
	public static int maxSubArray(int[] nums) {
		
		if(nums.length == 0) return 0;
		
		int currentMaxSum = nums[0];
		int n = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
			//Set the beginning of subarray
			n = Math.max(nums[i], n + nums[i]);
			
			//Calculate currentMaxSum
			currentMaxSum = Math.max(n, currentMaxSum);
		}
		
		return currentMaxSum;
	}
	
	public static int maxSubArray____(int[] nums) {
		int currentMaxSum = 0;
		int globalMaxSum = 0;
		boolean didBegin = false;
		
		for(int i = 0; i < nums.length; i++) {
			//set currentMaxSum to be the first positive integer in the list
			if(nums[i] > 0 && currentMaxSum == 0) {
				currentMaxSum = nums[i];
				didBegin = true;
			}
			
			if(didBegin) {
				int tmp = currentMaxSum + nums[i];
				
				if(nums[i] < 0) {
					
				}
				
				if(currentMaxSum > tmp) {
					
				}
			}
			
			
		}
		
		return currentMaxSum;
	}
	
	public static int maxSubArray__(int[] nums) {
		int currentMaxSum = nums[0];
		int maxSum = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
			int tmp = maxSum + nums[i];
			
			System.out.println("We are at num: " + nums[i]);
			System.out.println("Max Sum: " + maxSum);
			System.out.println("Current Max Sum: " + currentMaxSum);
			System.out.println("TMP: " + tmp);
			System.out.println("----------------------------------");
			
			if(nums[i] > tmp) {
				System.out.println("nums[i]: " + nums[i] + " is more than tmp: " + tmp);
				maxSum = nums[i];
			}else if(tmp > maxSum) {
				System.out.println("Tmp: " + tmp + " is more than maxSum: " + maxSum);
				maxSum = tmp;
			}else {
				System.out.println("Tmp: " + tmp + " is less than maxSum: " + maxSum);
				if(maxSum > currentMaxSum) {
					System.out.println("MaxSum: " + maxSum + " is more than currentMaxSum: " + currentMaxSum);
					currentMaxSum = maxSum;
					maxSum = nums[i];
					System.out.println("----------------------------------");
					continue;
				}
				
				maxSum = nums[i];
				System.out.println("MaxSum: " + maxSum + " is less than currentMaxSum: " + currentMaxSum);
			}
			
			System.out.println("----------------------------------");
				
		}
		
		if(maxSum > currentMaxSum) {
			currentMaxSum = maxSum;
		}
		
		
		return currentMaxSum;
	}
	
	
	
	
	
	
	public static int maxSubArray_(int[] nums) {
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
