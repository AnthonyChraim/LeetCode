import java.util.Arrays;

//Given an array nums of integers, return how many of them contain an even number of digits

public class evenNumOfDigits {

	public static void main(String[] args) {
		
		int[] nums = {12, 345, 2, 6, 7896};
		System.out.println(findNumbers3(nums));
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
	
	//one liner
	public static int findNumbers2 (int[] nums) {
		return (int) Arrays.stream(nums)
				.filter(x -> String.valueOf(x).length() % 2 == 0)
				.count();
	}
	
	public static int findNumbers3 (int[] nums) {
		int finalNum = 0;
		
		for (int num : nums) {
			int count = 0;
			while(num != 0) {
				count ++;
				num /= 10;
			}
			if(count % 2 == 0)
				finalNum ++;
		}
		
		return finalNum;
	}
	
}
