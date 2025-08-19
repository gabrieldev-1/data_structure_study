package arrays.exercises;

public class CountPairs {
    public int findPairs(int[] arr, int target) {
        int count = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) { 
            int sum = arr[left] + arr[right];

            if(sum == target) {
                count++;
                left++;
                right--;

            } else if( sum > target) {
                right--;

            } else {
                left++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        CountPairs solution = new CountPairs();
        int result = solution.findPairs(array, 7);

        if (result != 0) {
            System.out.println("O array possui " + result + " pares possiveis.");
        
        } else {
            System.out.println("Nenhum par encontrado.");
            
        }
    }
}
