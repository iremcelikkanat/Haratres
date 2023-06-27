package haratres;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NearNumbers {
 
	
	public void exceptionControl(int[] array) {
	
        if (array.length <= 1 || array.length >= 1000) {
        	throw new IllegalArgumentException("Array uzunlu�u 1 ve 100 aras�nda olmal�.");        }
        
        for (int i : array) {
            if (i < -20000 || i > 20000) {
	            throw new IllegalArgumentException("Array elemanlar -20000 ve 2000 aras�nda olmal�.");
            }
        }
	}
	public void sortingArray(int[] array) 
	{
			System.out.print("Yak�n Say�lar Listemiz: [");
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i]+ " ");
        }
            System.out.println("]");
    		System.out.print("S�ralanm�� Listemiz:    [");
    		
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

	            System.out.println("Sonu�:");
	         for (int x = 1; x < array.length; x++) 
	         {        
	        	 if (Math.abs(array[x] - array[x - 1])== minDifference) 
	        	 
	        	 {
	                System.out.println(array[x - 1] + " " + array[x]);
	        	 }
	        
	         }
	         	
}}
