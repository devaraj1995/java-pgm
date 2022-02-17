package pratice;

public class ShiftNumberBasedOnKey {
	public static void shiftTwoArray()
	{
		int[] ar1= {1,2,3};
		int[] ar2= {4,5,6,6};
		try
		{
			for(int i=0;i<ar2.length;i++)
			{
			System.out.print(ar1[i]+ar2[i]+" ");	
			}
			
		} 
		catch (Exception e) 
		{
			System.out.println("Index doesnt match");
			
		}
		
	}


public static void main(String[] args) 
{

	int[] ar1= {10,25,1,2,5,6,8};
	          // 0  1 2 3 4 5
	//key =1= 25,1,2,5,6,10
	//key=2 = 1,2.5,6,10,25
	int[] ar2=new int[ar1.length];
	int key=2;
	for(int i=0;i<ar1.length-key;i++)
	{
       ar2[i]=ar1[key+i];
	}
	for(int i=0;i<key;i++)
	{
    ar2[ar1.length-key+i]=ar1[i];
	}
	for(int i=0;i<ar1.length;i++)
	{
      System.out.println(ar2[i]);
	}
	System.out.println();
	shiftTwoArray();
	
}

}