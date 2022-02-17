package pratice;

public class ReverseStringAnArray {

	public static void main(String[] args) {
		String str="welcome to bellary";
		String[] strArr = str.split(" "); //converting the string array
		for (int i = 0; i < strArr.length; i++) { 
			String s=strArr[i];//assign the 1st element of array to ref variable s=welcome to bellary
			for (int j = s.length()-1; j >=0; j--) {//iterate over the string
				System.out.print(s.charAt(j));
				
			}
			  System.out.print(" ");
		}

	}

}
