package com.appliedmed.exercises.sumofbits;

public class SumOfBits {

    /**
     * Calculates the sum of bits in an integer. This is the same as counting
     * the number of "1"s in the number.
     *
     * @param number the input number
     * @return the sum of bits.
     */
    private static int sumOfBitsHelper(int number) {
	if (number == 0){
	    return 0;
	}
	return (number % 2) + sumOfBitsHelper(number/2);
    }
	
    public static int sumOfBits(int number) {
	if (number == 0){
	    return 0;
	}
	if (number < 0) {
	    if (number%2 == 0) {
		return -1 + sumOfBits(number/2);
	    }
	    return (32 - sumOfBitsHelper(-number/2));
	}
        return (number % 2 + sumOfBits(number/2));
    }
}