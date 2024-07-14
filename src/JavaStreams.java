import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class JavaStreams {

	
	
	@Test
	public void warning() {
		System.out.println("execute warning");
	} 
	
	@Test
	public void main() {


		List<String>  names = new ArrayList<String>();
		names.add("madhav");
		names.add("mahesh");
		names.add("Rajesh");
		names.add("eswar");
//		int count = 0;
//		for(String name : names) {
//			
//			if(name.startsWith("m")) {
//				System.out.println(name);
//				count++;
//			}
//		}
//		System.out.println(count);
		long count = names.stream().filter(s->s.contains("m")).count();
//		names.stream().forEach(s->System.out.println(s));
		System.out.println(count);
	}
	
	
	

}
