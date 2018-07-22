package andrey.practice.easy;

public class RemoveElement {

	public static void main(String[] args) {
		int[] input = {2,1,3,4,4,5,6};
		
		int newLength = removeElement(input, 1);
		
		System.out.println("Length of new array is: " + newLength);
		System.out.println("Here is the edited array:");
		for(int i = 0; i < newLength; i++) {
			if(i == newLength-1) {
				System.out.print(input[i] + "\n");
			}else {
				System.out.print(input[i] + ",");
			}
			
		}

	}
	
	public static int removeElement(int[] nums, int val) {
		if(nums.length == 0 || nums == null) return 0;
        
        int currentIndex = 0;
        int newLength = 0;
       
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
            		nums[currentIndex] = nums[i];
            		newLength++;
            		currentIndex++;
            }
        }
		return newLength;
    }

}
