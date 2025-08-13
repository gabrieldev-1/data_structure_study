package arrays.exercises;

public class CheckingArr {
    public void checkValueArr(int array[], int value) {
        for(int i = 0; i < array.length; i++) {
            if(value == array[i]) {
                System.out.println("O elemento existe dentro desse array.");
                return;

            }
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 3, 4, 5};
        CheckingArr checkingArr = new CheckingArr();

        checkingArr.checkValueArr(numbers, 4);
    }
}
