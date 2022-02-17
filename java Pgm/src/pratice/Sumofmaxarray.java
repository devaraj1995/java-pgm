package pratice;

public class Sumofmaxarray {

	public static void main(String[] args) {
int[] arr = {2,17,12,22,27};
int sum=0;
		
		// iterate the given the array value
		for(int i = 0; i<arr.length;i++)
		{
			
			// compare the given array
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
for(int i=0;i<3;i++) {
	sum=sum+arr[i];
}
System.out.println("sum of the max array"+sum);
	}
}
	


