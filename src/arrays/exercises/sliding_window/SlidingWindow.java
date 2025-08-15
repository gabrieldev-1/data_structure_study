package arrays.exercises.sliding_window;

public class SlidingWindow {
    public int searchMaxSum(int[] arr, int window) {
        // Verifica se o array é nulo ou se a janela é maior que o array
        if (arr == null || window > arr.length) {
            throw new IllegalArgumentException("Entrada inválida.");
        }

        // Variável para a soma atual da janela
        int currentSum = 0;

        // 1. Inicializa a janela: calcula a soma dos primeiros 'window' elementos
        for (int i = 0; i < window; i++) {
            currentSum += arr[i];
        }

        // A primeira soma é a nossa soma máxima inicial
        int maxSum = currentSum;

        // 2. Desliza a janela sobre o restante do array
        // O loop começa no índice 'window' e vai até o final do array
        for (int i = window; i < arr.length; i++) {
            // Atualiza a soma em O(1):
            // - Adiciona o novo elemento que entra na janela (arr[i])
            // - Subtrai o elemento que saiu da janela (arr[i - window])
            currentSum += arr[i] - arr[i - window];

            // 3. Compara e atualiza a soma máxima se a soma atual for maior
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 3, 2};
        SlidingWindow search = new SlidingWindow();
        
        // Exemplo com array de 4 elementos e janela de 3
        int result = search.searchMaxSum(array, 3); // A maior soma será 4 + 3 + 2 = 9
        System.out.println("A soma máxima para a janela de tamanho 3 é: " + result); // Saída: 9

        // Outro exemplo com um array maior
        int[] array2 = {1, 5, 2, 8, 3, 10};
        result = search.searchMaxSum(array2, 3); // A maior soma será 8 + 3 + 10 = 21
        System.out.println("A soma máxima para o segundo array é: " + result); // Saída: 21
    }
}