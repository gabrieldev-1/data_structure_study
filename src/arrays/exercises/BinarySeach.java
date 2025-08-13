package arrays.exercises;

public class BinarySeach {
    public int search(int[] arr, int element) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2; // Essa logica evita 'overflow'

            if(arr[mid] == element) {
                return mid;
            }

            if(arr[mid] > element) {
                right = mid - 1;
            }

            else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        BinarySeach search = new BinarySeach();

        int targetAdrr = search.search(numbers, 5);
        System.out.println(targetAdrr);
    }
}
