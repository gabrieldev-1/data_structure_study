package arrays.algorithms.two_pointer.exercises_two_pointer;

public class SumPares {
    public int[] SumParesArr(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left != right) {
            int currentSum = arr[left] + arr[right];

            if(currentSum == target) {
                return new int[]{left, right};
            }

            if(currentSum > target) {
                right--;
            }

            if(currentSum < target) {
                left++;
            }
        }

        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6};

        SumPares search = new SumPares();
        int[] result = search.SumParesArr(array, 7);
        if(result[0] == -1) {
            System.out.println("Alvo nao encontrado.");

        } else {
             System.out.println("posicoes " + result[0]+ " e " + result[1]);
        }

    }
}
