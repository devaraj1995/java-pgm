package pratice;

public class PatternPgm1 {

	public static void main(String[] args) {
		String s="ab12@x3";
		String al="";
		String num="";
		String sp="";
		
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')) {
				al=al+s.charAt(i);
				
			}else if (s.charAt(i)>='0'&& s.charAt(i)<='9') {
				
				num=num+s.charAt(i);
			}else {
				sp=sp+s.charAt(i);
			}
		}
		System.out.println(al); 
		System.out.println(num);
		System.out.println(sp);
		
	}
	
}



