package arrays.exercises;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] searchTarget(int[] arr, int target) {
        Map<Integer, Integer> numMap = new HashMap<>(); // HashMap, onde... key: numero value: indice do array;
        for(int i = 0; i < arr.length; i++) { // intera sobre o array;
            int complement = target - arr[i]; // calcula o complemento (quanto falta na soma para resultar no target);

            if(numMap.containsKey(complement)) { // checa se o complemento existe no hashMap;
                return new int[]{numMap.get(complement), i}; // retorna a solucao;

            }
            numMap.put(arr[i], i);

        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 18, 22};
        TwoSum solution = new TwoSum();

        int[] result = solution.searchTarget(array, 9);
        System.out.println("Primeiro indice: " + result[0]);
        System.out.println("Segundo indice: " + result[1]);
    }
}