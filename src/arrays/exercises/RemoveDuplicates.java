
package arrays.exercises;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public int[] removeDuplicates(int[] arr) {
        Map<Integer, Integer> arrMap = new HashMap<>();
        int[] result = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            if(!arrMap.containsKey(arr[i])) {
                result[i] = arr[i];

            }
            arrMap.put(arr[i], i);

        }

        return result;
    }

    public void readArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arrayOfNums = {1, 2, 3, 1, 4, 5, 2, 5};
        RemoveDuplicates solution = new RemoveDuplicates();

        int[] result = solution.removeDuplicates(arrayOfNums);
        solution.readArr(result);
        
    }
}

