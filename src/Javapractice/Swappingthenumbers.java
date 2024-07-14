package Javapractice;

import java.util.Scanner;

public class Swappingthenumbers {

	public static void main(String[] args) {


		String s = "";
		Scanner in = new Scanner(System.in);
		System.out.println("write the x and y values");
		int x = in.nextInt();
		int y = in.nextInt();
//		System.out.println("Before swaping the values are "+x+y);
//		// swapping the values with third variable
//		s = x;
//		x = y;
//		y = s;
//		System.out.println("After swapping the values are"+x+y);

		// swapping the values without third variable
		
		
		System.out.println("Before swaping the values are "+x+y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After swapping the values are"+x+y);
	}

}
