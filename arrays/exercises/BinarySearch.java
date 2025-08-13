package arrays.exercises;

public class BinarySearch {
    public int searchElement(int arr[], int element) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) { 
            int mid = left + (right - left) / 2;

            if(arr[mid] == element) {
                return mid; // Elemento encontrado
            }

            // Se o elemento do meio for MAIOR que o alvo, o alvo está à esquerda
            if(arr[mid] > element) {
                right = mid - 1; 
            } 
            // Se o elemento do meio for MENOR que o alvo, o alvo está à direita
            else {
                left = mid + 1;
            }
        }

        return -1; // Elemento não encontrado
    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int elementToFind = 2;
        int result = search.searchElement(arr, elementToFind);

        System.out.println("O elemento " + elementToFind + " está no índice: " + result); // Saída: O elemento 2 está no índice: 1

        elementToFind = 8;
        result = search.searchElement(arr, elementToFind);
        
        System.out.println("O elemento " + elementToFind + " está no índice: " + result); // Saída: O elemento 8 está no índice: -1
    }
}
