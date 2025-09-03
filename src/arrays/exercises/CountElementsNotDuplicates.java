package arrays.exercises;

public class CountElementsNotDuplicates {
    public int countElements(int[] arr) {
        int count = 0;
        int left = 0;
        int right = 1;

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[left] != arr[right]) {
                count++;
                left = right;
            }
            right++;

        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 2, 2, 3, 4, 5, 6};
        CountElementsNotDuplicates solution = new CountElementsNotDuplicates();

        int result = solution.countElements(nums);
        System.out.println(result);
    }
}
