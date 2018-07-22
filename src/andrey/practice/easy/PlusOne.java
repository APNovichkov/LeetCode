package andrey.practice.easy;

public class PlusOne {

	public static void main(String[] args) {
		int input[] = {9};

		System.out.println("Output array is: ");
		for(int integer: plusOne(input)) {
			System.out.print(integer + ",");
		}
	}
	
	public static int[] plusOne(int[] digits) {
		boolean allNine = true;
		
		for(int digit: digits) {
			if(digit != 9) {
				allNine = false;
				break;
			} 
		}
		
		if(!allNine) {
			if(digits[digits.length-1] == 9) {
				for(int i = digits.length-1; i >= 0; i--) {
					if(digits[i] != 9) {
						digits[i]++;
						break;
					}else {
						digits[i] = 0;
					}
				}
			}else {
				digits[digits.length-1] ++;
			}
		}else {
			int newOutputArray[] = new int[digits.length+1];
			for(int i = digits.length-1; i >= 0; i--) {
				if(digits[i] != 9) {
					newOutputArray[i+1] = digits[i] + 1;
					break;
				}else {
					newOutputArray[i+1] = 0;
				}
			}
			newOutputArray[0] = 1;
			return newOutputArray;	
		}
		
		return digits;
	}	
}
