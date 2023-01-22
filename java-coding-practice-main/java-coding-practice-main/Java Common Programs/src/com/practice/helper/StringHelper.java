package com.practice.helper;

public class StringHelper {

	public static String reverseString(String inputStr) {

		if (null == inputStr || inputStr.isEmpty() || inputStr.length() == 1) {
			return inputStr;
		}

		char[] temp = inputStr.toCharArray();
		StringBuilder reversedStr = new StringBuilder();

		for (int i = temp.length - 1; i >= 0; i--) {
			reversedStr.append(temp[i]);
		}

		return reversedStr.toString();
	}

	public static boolean isVowelPresent(String inputStr) {
		
		if (null == inputStr || inputStr.isEmpty()) {
			return false;
		}
		inputStr = inputStr.toLowerCase();
		if(inputStr.matches(".*[aeiou].*")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isPalidrome(String inputStr) {
		if (null == inputStr || inputStr.isEmpty()) {
			return false;
		}
		if(inputStr.length() == 1) {
			return true;
		}
		inputStr = inputStr.toLowerCase();
		for(int i=0; i< inputStr.length()/2 ; i++) {
			if(inputStr.charAt(i) != inputStr.charAt(inputStr.length() -1 -i)) {
				return false;
			}
		}
		return true;
	}
	
	public static String removeWhiteSpaces(String inputStr) {
		if (null == inputStr || inputStr.isEmpty()) {
			return inputStr;
		}
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i< inputStr.length(); i++) {
			if(!Character.isWhitespace(inputStr.charAt(i)))
				result.append(inputStr.charAt(i));
		}
		return result.toString();
	}

	public static String removeLeadingTrailingWhiteSpaces(String inputStr) {
		if (null == inputStr || inputStr.isEmpty()) {
			return inputStr;
		}
		inputStr = inputStr.trim();
		int startIndex = 0;
		for(int i=0 ; i< inputStr.length(); i++) {
			if(!Character.isWhitespace(inputStr.charAt(i))){
				startIndex = i;
				break;
			}
		}
		String result = inputStr.substring(startIndex);
		return result;
	}
}
