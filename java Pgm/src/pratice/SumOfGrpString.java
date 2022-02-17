package pratice;

public class SumOfGrpString {

	public static void main(String[] args) {
		String s="a12b13c30ss27";
		int sum=0;
		int tsum=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='0'&& s.charAt(i)<='9') {
				int n = s.charAt(i)-48;
				sum=sum*10+n;	
			}else {
				tsum=sum+tsum;
				sum=0;
			}
			
		}
     tsum=tsum+sum;
     System.out.println(tsum);
	}

}
