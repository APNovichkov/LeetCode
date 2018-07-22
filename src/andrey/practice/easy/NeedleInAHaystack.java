package andrey.practice.easy;

public class NeedleInAHaystack {

	public static void main(String[] args) {
		String haystack = "";
		String needle = "a";
			
		
		if(strStr(haystack, needle) == -1 || strStr(haystack, needle) == 0) {
			System.out.println("The needle: '" + needle + "' does not exist in the haystack: '" + haystack + "' or haystack is empty");
		}else {
			System.out.println("The index at which needle: '" + needle + "' occurs in haysack: '" + haystack + "' is " + strStr(haystack, needle));
		}
	}

	
	public static int strStr(String haystack, String needle) {
		if(haystack == "" || needle == "") return 0; 
        char[] needleChars = needle.toCharArray();
        int needleIndex = 0;
		for(int i = 0; i < haystack.length(); i++) {
        		if(haystack.charAt(i) == needleChars[needleIndex]) {
        			needleIndex++;
        		}
        		if(needleIndex == needle.length()) return i-(needle.length()-1);
        } 
		
		return -1;
    }
}
