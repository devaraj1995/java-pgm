package pratice;



public class Stringpolidrome {
	public static void main(String[] args) {
		
	String str="mom";
	String rev="";
	int length=str.length();
	for (int i = length-1; i >=0; i++) {
		rev=rev+str.charAt(i);		
	}
	if (str.equals(rev)) {
		System.out.println(str+"its a poly");	
	}
	else {
		System.out.println(str+"its  not a poly");		
	}
	}
	

}
