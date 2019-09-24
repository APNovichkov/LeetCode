package andrey.practice.easy;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		String[] inputs = {"II", "X", "IV", "IX", "LVIII", "MCMXCIV"};
		
		for(String input: inputs) {
			System.out.println(input + " in integer format is: " + romanToInt(input) );
		}
		
	}

	
	public static int romanToInt(String s) {
		int output = 0;
		
		if(s == "") return 0;
		
		//setup
		HashMap<String, Integer> romanToIntMap = new HashMap<>();
		romanToIntMap.put("I", 1);
		romanToIntMap.put("IV", 4);
		romanToIntMap.put("V", 5);
		romanToIntMap.put("IX", 9);
		romanToIntMap.put("X", 10);
		romanToIntMap.put("XL", 40);
		romanToIntMap.put("L", 50);
		romanToIntMap.put("XC", 90);
		romanToIntMap.put("C", 100);
		romanToIntMap.put("CD", 400);
		romanToIntMap.put("D", 500);
		romanToIntMap.put("CM", 900);
		romanToIntMap.put("M", 1000);
		
		
		char[] romanAsChars = s.toCharArray();
		
		for(int i = 0; i < romanAsChars.length; i++) {
			String charSequence = "" + romanAsChars[i];
			if(romanToIntMap.containsKey(charSequence)) {
				if(i != romanAsChars.length-1 && romanToIntMap.containsKey(charSequence + romanAsChars[i+1])) {
					charSequence += romanAsChars[i+1];
					i++;
				}
				output += romanToIntMap.get(charSequence);
			}else {
				return 0;
			}
		}
		
		
		return output;
	}
}
