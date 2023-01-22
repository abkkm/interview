package com.practice.helper;

import java.util.List;

public class NumbersHelper {

	public static int[] swapNumbers(int[] numbers) throws Exception {
		
		if(null == numbers || numbers.length != 2) {
			throw new Exception("Number array size should be 2");
		}
		System.out.println("Numbers before swapping: a=" + numbers[0] + ", b=" + numbers[1]);
		numbers[0] = numbers[0] + numbers[1];
		numbers[1] = numbers[0] - numbers[1];
		numbers[0] = numbers[0] - numbers[1];
		System.out.println("Numbers after swapping: a=" + numbers[0] + ", b=" + numbers[1]);
		return numbers;
	}
	
	public static boolean isPrime(int number) {
		if(0 == number || 1 == number) {
			return false;
		}
		if(2 == number) {
			return true	;
		}
		
		//Divide the number from 2 to n/2, if the reminder is 0, then its not a prime number
		for(int i=2; i<= number/2; i++) {
			if(0 == number%i) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isOnlyOdd(List<Integer> inputList) {
		for(Integer num: inputList) {
			if(num%2 == 0) { //Then the number is an even number
				return false;
			}
		}
		return true;
	}

}
