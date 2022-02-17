package pratice;

public class ArrayPgm {
	public static void main(String[] args) {
		int[] arr1= {2,7,0,12,0,17,0,0};
		int[] arr2=new int[arr1.length];
		int m=0;
		int n=arr1.length-1;
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i]==0) {
				arr2[n]=arr1[i];
				n--;
			}else {
				arr2[m]=arr1[i];
				m++;
			}
			}
		for (int j = 0; j < arr2.length; j++) {
			System.out.println(arr2[j]+" ");
			
		}
	
	}
}
