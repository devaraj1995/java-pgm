package pratice;

public class Withoutlenthandmethod {

	public static void main(String[] args) {
		
		String s="anusha";
		char[] sarray = s.toCharArray();
		int count=0;
		for (char c : sarray) {
			count++;
			
		}
		for(int i=count-1;i>=0;i--) {
			System.out.print(sarray[i]);
		}
	}

}

// note 
// length s to array use for  each loop to get length
// int length =s.lengthcmapareto(string)