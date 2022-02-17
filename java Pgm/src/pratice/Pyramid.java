package pratice;
public class Pyramid {

	    public static void main(String[] args)
	    {
	            
		System.out.println("Enter N : ");
		int n=5;  
		int x=1;
		for(int i=n;i>0 ;i--)
	               {
		        for(int j=0;j<n-i;j++)
	                
	                       {
	                               System.out.print(" ");
	                       }
	                       for(int j=0;j<(i*2)-1;j++)
	                
	                       {
	                               System.out.print(x);
	                              
	                              
	                       }
	                      System.out.println();
	               }                          
	    }
	}

