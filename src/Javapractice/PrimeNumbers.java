package Javapractice;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrimeNumbers {

	public void main() 
	{ 
		
		System.out.println(" Prime Numbers from 1 to 100 are : ");	
		for(int i = 1; i <= 100; i++)
		{
			Boolean isPrime = true;
		    for (int j = 2; j <= i/2; j++)
		    {
		    	if((i%j == 0))
		    	{
		    	 isPrime= false;
		    		break;
		    	}
		    }
		    if (isPrime && i!=1) {
		    	
		    	System.out.println(i);
		    }
//		    if(count == 0 && number != 1 )
//		    {
//		    	System.out.print(number + " ");
//		    }  
		}
	}
	
	@Test
	public void testcase1 () {
		System.out.println("testcase 1 is executed");
	}
	
	@AfterTest
	public void case1 () {
		System.out.println("This will execute in last of the test");
	}
	@Test
	public void case3 () {
		System.out.println("testcase 3 is executed");
		Assert.assertTrue(false);
	}
	
	@BeforeTest
	public void testcase2 () {
		System.out.println("This will execute Before test start");
	}
	
	
	
	
	

}
