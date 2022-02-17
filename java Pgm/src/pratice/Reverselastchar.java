package pratice;

public class Reverselastchar {

	public static void main(String[] args) {
  String s = "devaraj";
  String reverse=" ";
  for(int i=s.length()-1;i>=0;i--) {
	  reverse=reverse+s.charAt(i);
	  
  }
  System.out.println("reverse order given array"+reverse);
	}

}
