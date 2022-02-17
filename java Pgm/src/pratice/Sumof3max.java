package pratice;

public class Sumof3max {

	public static void main(String[] args) {
		
		int[] arr= {3,7,12,17,27};
		
		// iterate the given the array value
		for(int i = 0; i<arr.length;i++)
			//for(int i:arr){
	       //sum+sum+i;
			//sop(sum)
		{
			
			// compare the given array
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//sumo f3 max array
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
        System.out.println("sum of 3max array"+sum);
	}

}
