import java.util.HashMap;

public class LeetCodeTwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 2, 4 };
		int target = 6;
		int[] output = twoSum(nums, target);
		System.out.println(output[0]);
		System.out.println(output[1]);
	}

	private static int[] twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		
		/*for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					output[0] = i;
					output[1] = j;
				}
			}
		}*/
		
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		for(int i = 0 ; i < nums.length ; i++) {
			int complement = target - nums[i];
			if(hMap.containsKey(complement)) {
				return new int[] {hMap.get(complement), i};
			}
			hMap.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
