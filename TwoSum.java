public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0,0};
        int size = nums.length;
        for (int i = 0; i < size; i++){
			for (int j = i + 1; j < size; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i + 1;
					result[1] = j + 1;
				}
			}
		}
        return result;
    }
}
