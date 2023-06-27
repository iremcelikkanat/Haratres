package haratres;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		MergeString mString=new MergeString();
		String a = "hrte";
		String b = "aars";
		mString.exceptionControl(a, b);
		mString.MergeString(a,b);

		System.out.println("---------------------------------------------");

		NearNumbers nearNum=new NearNumbers();
		int[] array = {3, 1, 5, 23, 2, 4, 9, 10, 15, 31};
		nearNum.exceptionControl(array);
		nearNum.nearNumbers(array);
		
		System.out.println("---------------------------------------------");
		
		ShoppingCart sCart=new ShoppingCart();
		int[] array2 ={ 5, 6, 4, 3, 4 };
		sCart.exceptionControl(array2);
		sCart.shoppingCartList(array2);
		sCart.sumArray(array2);
	}

}
