package haratres;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {

	
	public void exceptionControl(int[] shopList) {
	
		   if (shopList.length <= 1 || shopList.length >= 100) {
		        throw new IllegalArgumentException("Array uzunlu�u 1 ve 100 aras�nda olmal�.");
		    }

		    for (int x : shopList) {
		        if (x <= 0 || x >= 2000) {
		            throw new IllegalArgumentException("Array elemanlar 0 ve 2000 aras�nda olmal�.");
		        }
		    }
	}
	
	public void shoppingCartList(int[] shopList) 
	{	       
		  List<Integer> noDiscount=new ArrayList();
		  
		  for(int i=1;i<shopList.length;i++) 
		  {
			
				if(shopList[i]<shopList[i-1])
				{	
					shopList[i-1]=shopList[i-1]-shopList[i];
				
				}	
				else
				{
					noDiscount.add(shopList[i-1]);	
				}
		   }
		  noDiscount.add(shopList[shopList.length-1]);

		  printShoppingArray(shopList);
		  arraySort(noDiscount,shopList);
	}
	
	public void arraySort(List noDiscount,int[] arraySize) 
	{	
		Collections.sort(noDiscount);
		System.out.println("�ndirimsiz: "+noDiscount);
	}
	
	public void printShoppingArray(int[] shopList) 
	{
		System.out.print("Al��veri� Listesi: [");
			for(int i=0;i<shopList.length;i++) 
			{
				System.out.print(shopList[i]+" ");

			}
			System.out.println("]");
	}
	
	
	public void sumArray(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++) 
		{			
			sum+=a[i];
		}
		System.out.print("Toplam: "+sum);
	}
	

}
