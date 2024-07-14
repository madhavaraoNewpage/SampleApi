package Javapractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Polindrome {

	
	@Test
	public void Rajesh() {

		
        String reverse = "";
		String s = "madhav";
		for(int i =s.length()-1;i>=0;i--)
		{
			reverse = reverse+s.charAt(i);
		}
		System.out.println(reverse);
		
		if(s.equalsIgnoreCase(reverse)) {
			System.out.println("value is polindrome");
		}
		else {
			System.out.println("value is not polindrome");
		}
	}
	
	@BeforeMethod
	public void case1 () {
		System.out.println("this will execute before method");
	}
	
	@AfterMethod
	public void case2 () {
		System.out.println("this will execute after method");
	}


}
