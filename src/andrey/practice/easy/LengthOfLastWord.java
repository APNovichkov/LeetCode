package andrey.practice.easy;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String phrase = "a";
		
		System.out.println("The length of the last word in phrase: " + phrase + " is: " + lengthOfLastWord(phrase));

	}
	
	public static int lengthOfLastWord(String s) {
        int lengthOfLastWord = 0;
		if(s.length() == 0) return 0;
		
		boolean hasThereBeenLetter = false;
		
		for(int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) != ' ') hasThereBeenLetter = true;
			if(s.charAt(i) != ' ' && hasThereBeenLetter) {
				lengthOfLastWord++;
			}else if(s.charAt(i) == ' ' && hasThereBeenLetter){
				break;
			}
		}
		return lengthOfLastWord;
    }

}
