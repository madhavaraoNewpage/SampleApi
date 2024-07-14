import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class javaexamples {

	public static void main(String[] args) {


//		String line = "This is my world";
//		Character[] a = {'a','e','i','o','u'};
//		int count = 0;
//		for(int i = 0;i<line.length();i++)
//		{
//			for(int j = 0;j<a.length;j++) {
//			if(line.charAt(i)==a[j]) {
//		   System.out.println(a[j]);
//		   count++;
//			}
//		}	
//	}
//		System.out.println(count);
//	}
		
		int n = 0 ;
		for(int i=2; i<100 ;i++ ) {
			if(!(n%i==0)) {
				System.out.println("prime numbers are " +n);
			}
		}

}
}
