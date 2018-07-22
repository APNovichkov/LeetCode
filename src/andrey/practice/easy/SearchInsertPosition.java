package andrey.practice.easy;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] inputNums = {1,3};
		int targetNum = 2;

		
		System.out.println("Target number: " + targetNum + " is or should be at index: " + searchInsert(inputNums, targetNum));
	}
	
	public static int searchInsert(int[] nums, int target) {
		if(nums.length == 0 || target < nums[0]) return 0;
		if(target > nums[nums.length-1]) return nums.length;
		if(nums.length == 1){
			if(target > nums[0]) return 1;
			if(target < nums[0] || target == nums[0]) return 0;
		}
		for(int i = 0; i < nums.length; i++) {
        		if(target > nums[i] && target < nums[i+1]) {
	    			return i+1;
	    		}else if(target == nums[i]) {
        			return i;
        		}
        }
		return 0;
    }

}
