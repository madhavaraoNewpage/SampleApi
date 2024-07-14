package Javapractice;

import org.testng.annotations.Test;

public class StringReverse2 {

	@Test
	public  void main() {
		String s1 = "Automation";
		StringBuilder s2 = new StringBuilder();
		s2.append(s1);
		StringBuilder s3 = s2.reverse();
		System.out.println("String in reverse :"+s3);
	}
}
