package pratice;

public class Array_descending_order {

	public static void main(String[] args) {
		
int[] arr = {2,7,12,22,17};
		
		// iterate the given the array value
		for(int i = 0; i<arr.length;i++)
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
	System.out.println("desecending order given array");
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		
	}
	


	}


