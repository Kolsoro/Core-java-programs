package test2;

public class Increasing {
	
	public static int[] inc(int arr[]) {
		int temp=0;
		  for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] < arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	               
	            	  
	            }     
	            
	        }    
		return  arr;
	}

}
