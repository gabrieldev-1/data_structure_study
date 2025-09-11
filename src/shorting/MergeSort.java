package shorting;
import java.util.Arrays;

public class MergeSort {
    public void mergesort(int [] arr) {
        int inputLength = arr.length;

        if(inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for(int i = 0; i < midIndex; i++) {
            leftHalf[i] = arr[i];
        }

        for(int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = arr[i];
        }

        mergesort(leftHalf);
        mergesort(rightHalf);
        merge(arr, leftHalf, rightHalf);

    }

    private void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while(i < leftSize && j < rightSize) {
            if(leftHalf[i] <= rightHalf[j]) {
                arr[k] = leftHalf[i];
                i++;
            
            } else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i < leftSize) {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j < rightSize) {
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] array = {6, 5, 2, 8, 1, 78, 23, 112, 32, 15};
        MergeSort solution = new MergeSort();

        System.out.println(Arrays.toString(array));

        solution.mergesort(array);

        System.out.println(Arrays.toString(array));
    }

}
