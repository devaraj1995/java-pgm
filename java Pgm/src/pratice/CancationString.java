package pratice;

public class CancationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc"+"xyz";
		//s= "abcxyz";
	//s.lenth/2=3;
		for (int i = 0; i < s.length()/2; i++) {
			System.out.print(s.charAt(i)+""+s.charAt(s.length()/2+i));//if i=0 0+3=a+x=sop=ax
			
		}
	}

}
