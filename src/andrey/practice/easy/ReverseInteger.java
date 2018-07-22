package andrey.practice.easy;

public class ReverseInteger {

	public static void main(String[] args) {
		
		
		System.out.println(reverse(-123456789));
		
//		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
//		System.out.println("MAX_VALUE +1 = " + ( Integer.MAX_VALUE +1) ) ;
//		System.out.println("MAX_VALUE +2 = " + ( Integer.MAX_VALUE +2) ) ;
//		
//		System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
//		System.out.println("MIN_VALUE -1 = " + (Integer.MIN_VALUE - 1)) ;
//
//		System.out.println("-MAX_VALUE = " + Integer.MAX_VALUE*(-1));
//		System.out.println("-MIN_VALUE = " + Integer.MIN_VALUE*(-1));
		
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
