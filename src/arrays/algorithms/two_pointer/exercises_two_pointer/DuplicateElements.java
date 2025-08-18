package arrays.algorithms.two_pointer.exercises_two_pointer;

public class DuplicateElements {
    public int removeDuplicates(int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0;
        }

        int slow = 0;

        for(int fast = 1; fast < arr.length; fast++) {
            if(arr[fast] != arr[slow]) {
                slow++;
                arr[slow] = arr[fast];

            }
        }

        return slow + 1;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 3, 3, 6, 9, 9};
        
        DuplicateElements search = new DuplicateElements();
        
        // Remove as duplicatas e retorna o novo comprimento
        int newLength = search.removeDuplicates(array);
        
        System.out.println("O novo comprimento do array sem duplicatas eh: " + newLength);

        System.out.print("Array após a remocao (in-place): [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i]);
            if (i < newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]"); // Saída esperada: [2, 3, 6, 9]
    }
}
