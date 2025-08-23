// algoritimo: binary search

package arrays.exercises;

public class FirstAndLastElement {

    public int[] findFirstAndLast(int[] arr, int target) {
        int[] result = {-1, -1};
        if (arr == null || arr.length == 0) {
            return result;
        }

        result[0] = findFirst(arr, target);
        result[1] = findLast(arr, target);

        return result;
    }

    private int findFirst(int[] arr, int target) {
        int firstIndex = -1;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                firstIndex = mid; // Armazena o índice encontrado
                right = mid - 1;   // Continua a busca na metade esquerda
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return firstIndex;
    }

    private int findLast(int[] arr, int target) {
        int lastIndex = -1;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                lastIndex = mid; // Armazena o índice encontrado
                left = mid + 1;  // Continua a busca na metade direita
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 7, 7, 8, 8, 10};
        FirstAndLastElement solution = new FirstAndLastElement();

        int target1 = 8;
        int[] result1 = solution.findFirstAndLast(numbers, target1);
        System.out.println("O elemento " + target1 + " aparece pela primeira vez no índice " + result1[0] + " e pela última vez no índice " + result1[1]);

        int target2 = 6;
        int[] result2 = solution.findFirstAndLast(numbers, target2);
        System.out.println("O elemento " + target2 + " aparece pela primeira vez no índice " + result2[0] + " e pela última vez no índice " + result2[1]); 
    }
}