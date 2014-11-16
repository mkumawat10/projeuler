package com.projeuler;

public class Executioner {

	public static void main(String args[])
	{
		Problems mulSum = new Problems();
		
		// Sum of Multiples of 3 or 5 below 1000		
		System.out.println("Sum of Multiples of 3 or 5 below 1000 = "+mulSum.sumOfMutiplesOf3or5());
		
		// Sum of 4 million Fibonacci terms that does not exceed 4 million
		System.out.println("Sum of 4 million Fibonacci terms that does not exceed 4 million = "+mulSum.sumOfEvenFibTerms());
		
	}
}
