package pratice;

import java.util.LinkedHashSet;

public class Nonduplicateschar {


	public static void main(String[] args) {
		
			String s="devaraj";
			LinkedHashSet<Character> set = new LinkedHashSet<Character>();
			for(int i=0;i<s.length();i++)
			{
				set.add(s.charAt(i));
			}
		for (char ch : set) { 
			int count=0;
			for(int i=0;i<s.length();i++) {
			if(ch== s.charAt(i)) {
				count++;
			}		
				
			}
         // if(count>1) {     
		if(count==1) //for non-duplicates
		{
				System.out.println(ch+":"+count);
          }
	}

	}
}


