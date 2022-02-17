package pratice;

import java.util.LinkedHashSet;
 
public class Addarraytoset {

	public static void main(String[] args) {
		String s="hello world hello all welcome to bellary";
		 String[] sarray = s.split(" ");
		 LinkedHashSet<String> set = new LinkedHashSet<String>();
		 for (String word : sarray) { // iterate over array
			 set.add(word);
		}
       for( String word1: set) { // Iterate over the set 
    	   int count=0;  
    	   for(String word2:sarray) { // compare two array 
    		   if(word1.equals(word2)) {
    			   count++;
    		   }
    			   
    	   }
    	   System.out.println(word1+":"+count);
       }
	}

}

