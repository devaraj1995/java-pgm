 package pratice;

import java.util.LinkedHashSet;

public class Positioncharpgm {

	public static void main(String[] args) {
		String s="tester";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));	
		}
    for (Character ch : set) {//get the set(t,e,s,r)
    	//int count=0;
    	for (int i = 0; i < s.length(); i++) {//campare the each set with string
    		
			if (ch==s.charAt(i)) {
				System.out.println(ch+" the position is "+(i+1));//to set position of the given string
				break;
				
			}
		}
		
	}
	}

}
