package pratice;

public class Reversestringword {

	public static void main(String[] args) {
		String s="welcome to india";
		String[] str=s.split(" ");
		String temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		for (String st : str) {
			System.out.print(st+" ");
		}
			
		}
}

