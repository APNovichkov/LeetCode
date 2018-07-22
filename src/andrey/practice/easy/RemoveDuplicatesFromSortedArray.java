package andrey.practice.easy;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] input = {};
		
		int newLength = removeDuplicates(input);
		
		System.out.println("Length of new array is: " + removeDuplicates(input));
		System.out.println("Here is the edited array:");
		for(int i = 0; i < newLength; i++) {
			if(i == newLength-1) {
				System.out.print(input[i] + "\n");
			}else {
				System.out.print(input[i] + ",");
			}
			
		}
	}
	
	public static int removeDuplicates(int[] nums) {
		if(nums.length == 0 || nums == null) return 0;
		
        int currentIndex = 0;
        int newLength = 1;
        
        System.out.println("Length of the input array is: " + nums.length);
        
        for(int i = 0; i < nums.length-1; i++) {
        		if(nums[currentIndex] != nums[i+1]) {
        			currentIndex++;
        			newLength++;
        			nums[currentIndex] = nums[i+1];
        			System.out.println(currentIndex + " is currentIndex for nums[" + i + "] is: " + nums[i]);
        			
        			
        		}
        		
        		System.out.println("nums[" + i + "] is: " + nums[i]);
        		
        }
		
		
		return newLength;
    }

}
