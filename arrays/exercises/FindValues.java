package arrays.exercises;

public class FindValues {    
    int biggerValue;
    int minorValue;

    public int findBigger(int array[]) {
        biggerValue = array[0];

        for(int i = 0; i < array.length; i++) {
            if (array[i] > biggerValue) {
                biggerValue = array[i];

            }
        }
        return biggerValue;
    }

    public int findMinor(int array[]) {
        minorValue = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] < minorValue) {
                minorValue = array[i];
            }
        }
        return minorValue;
    }

    public static void main(String[] args) {
        FindValues search = new FindValues();
        int numbers[] = {20, 10, 23, 6, 1};

        System.out.println(search.findBigger(numbers));
        System.out.println(search.findMinor(numbers));


    }
}
