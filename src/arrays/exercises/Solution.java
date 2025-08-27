package arrays.exercises;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int sum = nums[left] + nums[right];

            if(sum == target) {
                return new int[]{left, right};

            }

            if(sum < target) {
                left = left + 1;
            }

            if(sum > target) {
                right = right - 1;
            }
        }

        return new int[]{-1, -1};

    }
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        Solution solution = new Solution();
        int[] result = solution.twoSum(array, 9);
        
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}