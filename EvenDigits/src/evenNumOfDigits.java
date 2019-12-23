//Given an array nums of integers, return how many of them contain an even number of digits

public class evenNumOfDigits {

	public static void main(String[] args) {
		
		int[] nums = {12, 345, 2, 6, 7896};
		System.out.println(findNumbers(nums));
//
	}
	
	public static int findNumbers (int[] nums) {
		int finalNum = 0;
		for(int i =0; i < nums.length; i++) {
			if(Integer.toString(nums[i]) != null && Integer.toString(nums[i]).length() % 2 == 0) {
				finalNum++;
			}
		}
		return finalNum;
		
	}
	
}
