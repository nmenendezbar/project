package recipes.lambda;

import java.util.function.Function;

public class Reverse {
	interface ReverseType {
	    String reverse(String text);
	}
	
	 public static void main(String[] args){
		 
		 //Write custom functional interfaces that can be implemented via lambda expressions. 
		 ReverseType newText = (testText) -> {
			    String tempStr = "";
			    for (String part : testText.split(" ")) {
			        tempStr = new StringBuilder(part).reverse().toString();
			    }
			    return tempStr;
		 };
		 
		 System.out.println(newText.reverse("HELLO"));
		 
		 //Use a functional interface that is contained within the java.util.function package to implement a lambda expression
		 Function<String,String> newText2 = (testText) -> {
			    String tempStr = "";
			    for (String part : testText.split(" ")) {
			        tempStr = new StringBuilder(part).reverse().toString();
			    }
			    return tempStr;
		};
		
		System.out.println(newText2.apply("WORLD"));
			
			
	 }
	
	
}
