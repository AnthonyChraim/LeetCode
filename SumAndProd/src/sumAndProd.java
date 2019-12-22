

//Given an integer number n, return the difference between the product of its digits and the sum of its digits.


public class sumAndProd {

	public static void main(String[] args) {

		System.out.println(substractProductAndSum(4421));
		
	}

	
	public static int substractProductAndSum(int n) {
			int product = 1;
			int sum = 0;
			
			while(n != 0) {
				product *= n % 10 ;
				sum += n % 10;
				n /= 10;	
			}
			
			return product - sum;
	}
}
