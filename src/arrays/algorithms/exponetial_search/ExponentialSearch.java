package arrays.algorithms.exponetial_search;

public class ExponentialSearch {
    private int BinarySeach(int[] arr, int left, int right, int target) {

        while(left <= right) {
            int mid = left + (right - left) / 2;

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

    public int exponentialSearch(int[] arr, int target) {
        int n = arr.length;

        if(arr[0] == target) {
            return 0;
        }

        int i = 1;

        while(i < n && arr[i] < target) {
            if(arr[i] == target) {
                return i;

            }
            i *= 2;
        }

        return this.BinarySeach(arr, i / 2, Math.min(i, n - 1), target);
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int target = 20;
        ExponentialSearch search = new ExponentialSearch();
        int result = search.exponentialSearch(array, target);

        if (result == -1) {
            System.out.println("Elemento nao encontrado.");

        } else {
            System.out.println("Elemento " + target + " esta na posicao: " + result);

        }

    }
}
