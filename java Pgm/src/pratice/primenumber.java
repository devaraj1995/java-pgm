package pratice;

public class primenumber {

	public static void main(String[] args) { 
		
		int n=60;
		for(int i=2;i<=n;i++)
		{
			int count=0;
			for(int j=i-1;j>=2;j--)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
		}
	}
}
