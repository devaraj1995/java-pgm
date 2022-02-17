package pratice;

public class swaptwostringswithoutthirdvariable {

	public static void main(String[] args) {
		String s="abc"+"xyz";
		String s1="abc";
		String s2="xyz";
		s1=s1+s2;//abc+xyz=6=s1
		s2=s1.substring(0,s1.length()-s2.length());//6-3=3
		s1=s1.substring(s2.length());
		System.out.println(s2);
	}

}



