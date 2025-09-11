package shorting;
import java.util.Arrays;

public class Quicksort {
    public void sort(int array[], int left, int right) {
        if (left < right) {
            int p = partition(array, left, right);
            sort(array, left, p);
            sort(array, p + 1, right);

        }
    }
    
    public int partition(int[] array, int left, int right) {
        int mid = (int) (left + right) / 2;
        int pivot = array[mid];
        int i = left - 1;
        int j = right + 1;

        while(true) {

            do {
                i++;
            } while(array[i] < pivot);

            do {
                j--;
            } while(array[j] > pivot);

            if(i >= j) {
                return j;

            }

            int aux = array[i];
            array[i] = array[j];
            array[j] = aux;

        }
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 2, 3, 1, 2, 100, 99};
        Quicksort solution = new Quicksort();

        System.out.println("Array desordenado: ");
        System.out.println(Arrays.toString(array));

        solution.sort(array, 0, array.length - 1);

        System.out.println("Array ordenado: ");
        System.out.println(Arrays.toString(array));
    }
}
