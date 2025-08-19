package arrays.exercises;

public class TwoSum {
    public int[] searchSum(int[] arr, int target) {
        int[] result = new int[2];

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                
                if(arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 1, 1, 5};
        TwoSum search = new TwoSum();

        int[] result = search.searchSum(array, 7);
        if(result != null) {
            System.out.println(result[0] + " e " + result[1]);

        } else {
            System.out.println("Valor nao encontrado.");
        }
    }
}