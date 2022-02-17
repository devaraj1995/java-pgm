package pratice;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hashset {

	public static void main(String[] args) {
		String s="hello world";
		LinkedHashSet set = new LinkedHashSet<>();
		//TreeSet set = new TreeSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
for (Object ch : set) {
	System.out.print(ch);
	
	
}
	}

}

