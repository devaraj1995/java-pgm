package pratice;

public class Sumgroupedstring {

	public static void main(String[] args) {
		String s="12ab10c3";
		int sum=0;
		int gnum=0;//for integers variable
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i)>='0'&& s.charAt(i)<='9') {
				int  n=s.charAt(i)-48;// we convert the integers dat y we write 
				gnum=gnum*10+n;
			}else {
				sum=sum+gnum;//for 1st and 2nd group
				gnum=0;
			}
		}
		sum=sum+gnum;//3rd grp 
	System.out.println("sum of the number is "+sum);
	}
	

	}


