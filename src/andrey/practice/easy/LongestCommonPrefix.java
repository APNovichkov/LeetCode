package andrey.practice.easy;

import java.util.HashMap;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] words = {""};
		System.out.println(longestCommonPrefix(words));
		
	}
	
	public static String longestCommonPrefix(String[] strs) {
		String commonPrefix = "";
		
		if(strs.length == 0) return commonPrefix;
		
		int charIndex = 0;
		int stringIndex = 0;
		boolean atEndOfShortestString = false;
		
		while(!atEndOfShortestString) {
			char[] currentCharArray = strs[stringIndex].toCharArray();
			char[] nextCharArray = strs[stringIndex+1].toCharArray();
		
			//Check for when shortest string ends
			if(charIndex >= currentCharArray.length || charIndex >= nextCharArray.length) break;
			
			char currentChar = currentCharArray[charIndex];
			char nextChar = nextCharArray[charIndex];
			
			if(currentChar != nextChar) break;
			
			stringIndex++;
			if(stringIndex + 1 == strs.length) {
				commonPrefix += currentChar;
				stringIndex = 0;
				charIndex++;
			}
		}
		return commonPrefix;
    }

}
