package andrey.practice.easy;

public class Palindrome {

	public static void main(String[] args) {
		int testNum = 12321;
		if(isPalindrome(testNum)) {
			System.out.println(testNum + " is a palindrome!" );
		}else {
			System.out.println(testNum + " is not a palindrome!" );
		}
		
	}
	
	public static boolean isPalindrome(int x) {
		boolean isPalindrome = false;
		if(x == reverse(x)) isPalindrome = true;
		return isPalindrome;
    }
	
	public static int reverse(int x) {
		if(x == Integer.MIN_VALUE) return 0;
		int sign = x > 0 ? 1 : -1;
		x *= sign;
		int output = 0;
        int remainder = 0;
		while( x != 0 ) {
			remainder = x%10;
			output = output*10 + remainder;
			x = x/10;
		}
		return output*sign;        
    }

}
