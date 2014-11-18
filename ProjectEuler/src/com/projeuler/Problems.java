package com.projeuler;

public class Problems {

	// Sum of multiples of 3 or 5 below 1000
	public int sumOfMutiplesOf3or5(){
		int sum = 0, counter = 0;
		while(counter < 1000)
		{
			if(counter%3 == 0)
				sum += counter;				
				
			else if(counter%5 == 0)
				sum += counter;
			
			counter++;
		}
		return sum;
	}
	
	// Sum of 4 million Fibonacci terms that does not exceed 4 million 
	public int sumOfEvenFibTerms(){
		int sum = 0, f0 = 0, f1 = 1, f2 = 1;
		while(f2 < 4000000)
		{
			f2 = f0 + f1;
			f0 = f1;
			f1 = f2;
			
			if(f2 % 2 == 0)
				sum += f2;
		}
		return sum;
	}
	
	// largest prime factor
	
	public int largestPrimeFactor(){
		long number = 600851475143;
		int primeFactor = 2, largestPrimeFactor = 2;
		
		while(number != primeFactor)
		{
			if(number % primeFactor == 0)
			{
				number = number / primeFactor;
				if(primeFactor > largestPrimeFactor)
					largestPrimeFactor = primeFactor;
					
				primeFactor = 2;	
			}
			else
				primeFactor++;
		}
		return largestPrimeFactor;
	}
}
