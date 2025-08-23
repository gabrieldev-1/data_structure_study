//algoritimo: "Sliding Window"
package arrays.exercises;

public class MaxSumsubarray {
    public int seachMaxSum(int[] arr, int windowLengh) {
        if(windowLengh > arr.length) {
            return -1;
        }
        
        int currentSum = 0;
        int maxSum = 0;

        // calcula a soma da primeira janela;
        for(int i = 0; i < windowLengh; i++) {
            currentSum += arr[i];
        }

        maxSum = currentSum;

        for(int i = windowLengh; i < arr.length; i++) {
            // Adiciona um novo elemento e subtrai o primeiro;
            currentSum = currentSum + arr[i] - arr[i - windowLengh];

            if(currentSum > maxSum) {
                maxSum = currentSum;

            }
        }

        return maxSum;

    }

    public static void main(String[] args) {
        int[] array = {5, 6, 7, 1, 2, 3, 4};
        MaxSumsubarray resolution = new MaxSumsubarray();
        int result = resolution.seachMaxSum(array, 3);

        if(result == -1 ) {
            System.out.println("Valores de entrada invalidos.");

        } else {
            System.out.println("A soma maxima dos valores e: " + result);
        }
    }
}