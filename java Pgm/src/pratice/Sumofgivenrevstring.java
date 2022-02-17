package pratice;

public class Sumofgivenrevstring {

	public static void main(String[] args) {
	String s="a1b2c3";
	int sum=0; //for integers variable
	for (int i = 0; i < s.length(); i++) {
		
		if (s.charAt(i)>='0'&& s.charAt(i)<='9') {
			int  n=s.charAt(i)-48;// we convert the integers dat y we write 
			sum=sum+n;
		}
	}
System.out.println("sum of the number is "+sum);
}
}
