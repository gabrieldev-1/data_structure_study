// algoritimo: binary search

package arrays.exercises;

public class FindNumber {
    public int findIndex(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2; // Isso evita 'overflow'

            if(arr[mid] == target) {
                return mid;
            }

            if(arr[mid] > target) {
                right = mid - 1;
            }

            if(arr[mid] < target) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 5, 6, 7};
        int target = 7;
        FindNumber resolution = new FindNumber();
        int result = resolution.findIndex(array, target);

        if(result != -1) {
            System.out.println("O elemento " + target + " esta na posicao " + result);

        } else {
            System.out.println("Elemento nao encontrado.");

        }
    }
}
