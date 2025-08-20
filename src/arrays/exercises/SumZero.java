// algoritimo: "Two Pointer"

package arrays.exercises;

public class SumZero {
    public int[] findSumZero(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int sum = arr[left] + arr[right];

            if(sum == 0) {
                return new int[]{left, right};

            }

            if(sum < 0) {
                left++;
            }

            if(sum > 0) {
                right--;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, 0, 1, 2};
        SumZero solution = new SumZero();

        int[] result = solution.findSumZero(arr);
        if(result != null) {
            System.out.println(result[0] + " e " + result[1]);
        } else {
            System.out.println("Valor nao encontrado.");
        }
    }
}
