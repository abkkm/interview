package com.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.practice.helper.NumbersHelper;
import com.practice.helper.StringHelper;

class PracticeTests {

	@Test
	void testReveseString() {
		Assertions.assertEquals(StringHelper.reverseString("hello"), "olleh");
	}
	
	@Test
	void testIsVowelPresent() {
		Assertions.assertEquals(StringHelper.isVowelPresent("hello"), true);
	}
	
	@Test
	void testIsVowelPresentFalse() {
		Assertions.assertEquals(StringHelper.isVowelPresent("hdhd"), false);
	}
	
	@Test
	void testSwapNumbers() {
		int[] input = {2,4};
		int[] expected = {4,2};
		try {
			Assertions.assertArrayEquals(NumbersHelper.swapNumbers(input), expected);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	void TestIsPrime() {
		Assertions.assertEquals(NumbersHelper.isPrime(2), true);
		Assertions.assertEquals(NumbersHelper.isPrime(19), true);
		Assertions.assertEquals(NumbersHelper.isPrime(17), true);
		Assertions.assertEquals(NumbersHelper.isPrime(9829), true);
		Assertions.assertEquals(NumbersHelper.isPrime(10), false);
		Assertions.assertEquals(NumbersHelper.isPrime(9), false);
	}
	
	@Test
	void TestIsOnlyOdd() {
		List<Integer> inputList = new ArrayList<Integer>();
		inputList.add(3);
		inputList.add(31);
		inputList.add(33);
		inputList.add(39);
		Assertions.assertEquals(NumbersHelper.isOnlyOdd(inputList),true);
	}
	
	@Test
	void TestIsPalindrome() {
		Assertions.assertEquals(StringHelper.isPalidrome("Madam"),true);
		Assertions.assertEquals(StringHelper.isPalidrome("Field"),false);
		Assertions.assertEquals(StringHelper.isPalidrome("16461"),true);
		Assertions.assertEquals(StringHelper.isPalidrome("MADam"),true);
	
	}
	
	@Test
	void TestRemoveWhiteSpaces() {
		Assertions.assertEquals(StringHelper.removeWhiteSpaces("  Madam  "),"Madam");
		Assertions.assertEquals(StringHelper.removeWhiteSpaces("    "),"");
	}
	
	@Test
	void TestRemoveLeadingTrailingWhiteSpaces() {
		Assertions.assertEquals(StringHelper.removeLeadingTrailingWhiteSpaces("  Madam  "),"Madam");
		Assertions.assertEquals(StringHelper.removeLeadingTrailingWhiteSpaces("  Mad am   "),"Mad am");
	}
	

}
