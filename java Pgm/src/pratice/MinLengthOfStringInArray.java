  package pratice;

public class MinLengthOfStringInArray {

	public static void main(String[] args) {
		String[] str= {"anusha","devaraj","shalini","nikhil","shivu","shrut"};
		
		String minlength=str[0];
		for (int i = 1; i < str.length; i++) {
			if (minlength.length()>str[i].length()) {
				
				minlength=str[i];//intialization
				
			}
			
		}
	//compare the iterate 2 values
		for (int i = 0; i < str.length; i++) {
			if (minlength.length()==str[i].length()) {
				System.out.println(str[i]);
		}

	}
		}
	}

