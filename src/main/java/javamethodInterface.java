

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class javamethodInterface {
public static void main( String args[]) {
	List<String> ar=Arrays.asList("a","b");
	Consumer<String> con=new Consumer<String>() {		

		@Override
		public void accept(String t) {
			System.out.println(t);
			
			
		}
	};
	ar.forEach(con);
	
	ar.forEach(t->System.out.println(t));
	//call by method functional programming (function to function ) 
	ar.forEach(System.out::println);
}
}
