package shorting;
import java.util.Arrays;

// complexidade temporal: O(n²)
// complexidade espacial: O(1)

public class BubbleSort {
	public void sort(int[] arr) {
		boolean swap = true;

		while(swap) {
			swap = false;

			for(int i = 0; i < arr.length - 1; i++) {
				if(arr[i] > arr[i + 1]) {
					swap = true;

					int temp = arr[i];
					arr[i] = arr[i + 1];
				       	arr[i + 1] = temp;
				}	
			}
		}
	}

	public static void main(String[] agrs) {
		int[] array = {1, 5, 7, 3, 2, 8, 4, 9, 6};
		BubbleSort solution = new BubbleSort();

		System.out.println(Arrays.toString(array));

		solution.sort(array);

		System.out.println(Arrays.toString(array));
	
	}
}
