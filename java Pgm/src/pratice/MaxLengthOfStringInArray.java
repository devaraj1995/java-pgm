 package pratice;

public class MaxLengthOfStringInArray {

	public static void main(String[] args) {
	String[] str= {"anushaa","devaraj","shalin","nikhil","shivu"};
	
	String maxlength=str[0];
	for (int i = 1; i < str.length; i++) {
		if (maxlength.length()<str[i].length()) {
			
			maxlength=str[i];//intialization
			
		}
		
	}
//compare the iterate 2 values
	for (int i = 0; i < str.length; i++) {
		if (maxlength.length()==str[i].length()) {
			System.out.println(str[i]);
	}

}
	}
}
