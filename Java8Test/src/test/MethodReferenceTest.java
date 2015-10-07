package test;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest {
	public static void main(String args[]){
	      List<String> names = new ArrayList<String>();
			
	      names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
		
	      for (String name : names) {
	    	  System.out.println(name);
	      }
	      
	      names.forEach(name-> System.out.println(name));
	      
	      names.forEach(System.out::println);
	   }
}
