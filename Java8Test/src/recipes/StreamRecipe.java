package recipes;

import java.util.ArrayList;
import java.util.List;

public class StreamRecipe {

	public static void main(String[] args) {
		List<String> myList = new ArrayList();

		// Populate the list
		for(int x = 0; x <= 10; x++){
		    myList.add("Test " + x);
		}

		// Print each element within the list using lambda expressions
		myList.stream().forEach((value)->{
		    System.out.println(value);
		});
		
		//method reference
		myList.stream().forEach( System.out::println);
		
		//comment
		//comment fixed
		//complete comment in branch
	}

}
