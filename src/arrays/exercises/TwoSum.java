package arrays.exercises;

public class TwoSum {
    public int[] searchTarget(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        // o loop continua ate os ponteiros se cruzarem;
        while(left < right) {
            int sum = arr[left] + arr[right];
        
            if(sum == target) {
                return new int[]{left, right};

            }
            if(sum < target) {
                left++;

            }
            if(sum > right) {
                right--;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 3, 3};
        TwoSum solution = new TwoSum();

        int[] result = solution.searchTarget(array, 6);
        if(result != null) {
            System.out.println("Indices " + result[0] + " e " + result[1]);
        
        } else {
            System.out.println("Valor nao encontrado.");

        }
    }
}