package Strings;

public class StringQuestions {

	public static void printString(String str) {
		int n = str.length();
		for(int i=0; i<n; i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
		}
	}
	
	public static int countString(String str) {
		char[] arr = str.toCharArray();
		int count = 0;
		for(char ch: arr) {
			count++;
		}
		return count;
	}
	
	public static int countVowels(String str) {
		int count =0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
				count++;
			}
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U') {
				count++;
			}
		}
		return count;
	}
	
	public static void reverseString(String str) {
		StringBuilder newStr = new StringBuilder();
		for(int i=str.length()-1; i>=0; i--) {
			newStr.append(str.charAt(i));
		}
		System.out.println(newStr);
	}
	
	public static void main(String[] args) {
		String str = "Sanskrati";
		printString(str);
		System.out.println(countString(str));
		System.out.println(countVowels(str));
		reverseString(str);
		
	}

}
