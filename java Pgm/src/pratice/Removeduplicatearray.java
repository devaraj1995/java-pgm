 package pratice;

import java.util.LinkedHashSet;

public class Removeduplicatearray {

	public static void main(String[] args) {
		String s="hello welcome hello all welcome to bellary";
		 String[] sarray = s.split(" ");
		 LinkedHashSet<String> set = new LinkedHashSet<String>();
		 for (String word : sarray) {
			 set.add(word);	
		}
         for (String word1 : set) {
	     System.out.println(word1);
	
}
	}

}
