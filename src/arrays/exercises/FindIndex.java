package arrays.exercises;

public class FindIndex {
    public int find(int array[], int element) {

        for(int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 5, 6, 2, 3};
        FindIndex search = new FindIndex();

        int indexOne = search.find(numbers, 1);
        System.out.println(indexOne);
    }
}
