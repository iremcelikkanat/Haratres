package haratres;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NearNumbers {
 
	
	public void exceptionControl(int[] array) {
	
        if (array.length <= 1 || array.length >= 1000) {
        	throw new IllegalArgumentException("Array uzunluðu 1 ve 100 arasýnda olmalý.");        }
        
        for (int i : array) {
            if (i < -20000 || i > 20000) {
	            throw new IllegalArgumentException("Array elemanlar -20000 ve 2000 arasýnda olmalý.");
            }
        }
	}
	public void sortingArray(int[] array) 
	{
			System.out.print("Yakýn Sayýlar Listemiz: [");
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i]+ " ");
        }
            System.out.println("]");
    		System.out.print("Sýralanmýþ Listemiz:    [");
    		
	    Arrays.sort(array);

    	 for (int i = 0; i < array.length; i++) 
    	 {
    	     System.out.print(array[i]+ " ");
    	 }
             System.out.println("]");           
	}

	  public  void nearNumbers(int[] array) {

		  	sortingArray(array);
	        int minDifference=2;
	        for (int i = 1; i < array.length; i++) 
	        {
	            int difference = Math.abs(array[i] - array[i - 1]);
	                   
	            if ( difference < minDifference) 
	            {
	                minDifference = difference;
	            }	  
	         }

	            System.out.println("Sonuç:");
	         for (int x = 1; x < array.length; x++) 
	         {        
	        	 if (Math.abs(array[x] - array[x - 1])== minDifference) 
	        	 
	        	 {
	                System.out.println(array[x - 1] + " " + array[x]);
	        	 }
	        
	         }
	         	
}}
