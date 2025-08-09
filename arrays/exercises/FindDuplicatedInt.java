package arrays.exercises;

public class FindDuplicatedInt {
    public int value;

    public int find(int array[]) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if(array[i] == array[j] && i != j) {
                    value = array[i];

                }
            }
        }

        return value;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 10, 20, 3, 6, 7, 8, 9, 2};
        FindDuplicatedInt search = new FindDuplicatedInt();
        System.out.println(search.find(array));
    }
}