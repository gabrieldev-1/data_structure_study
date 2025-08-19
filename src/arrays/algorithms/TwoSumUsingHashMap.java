package arrays.algorithms;
import java.util.HashMap;

public class TwoSumUsingHashMap {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {    
            int complement = target - nums[i];

            if(numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i };

            }
            numMap.put(nums[i], i);

        }
        throw new IllegalArgumentException("Nenhuma solução encontrada.");

    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        TwoSumUsingHashMap solution = new TwoSumUsingHashMap();
        int[] result = solution.twoSum(nums, target);
        
        if (result.length == 2) {
            System.out.println("Os índices são: " + result[0] + " e " + result[1]);
        }
    }
}
