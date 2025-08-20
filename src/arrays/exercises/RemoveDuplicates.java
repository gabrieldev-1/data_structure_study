// algoritimo: "Two Pointer"

package arrays.exercises;

public class RemoveDuplicates {
    public int removeElements(int[] arr) {
        if(arr.length == 0) {
            return 0;

        }

        int i = 0;

        for(int j = 1; j < arr.length; j++) {
            if(arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];

            }
        }
        return i + 1;

    }
    public static void main(String[] args) {
        // O array DEVE estar ordenado para que a técnica funcione.
        int[] array = {1, 1, 2, 2, 2, 3, 3, 4};
        RemoveDuplicates solution = new RemoveDuplicates();
        
        int newLength = solution.removeElements(array);
        System.out.println("O novo comprimento do array é: " + newLength);

        // Imprime o array modificado para mostrar o resultado.
        System.out.print("Array com duplicatas removidas: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

