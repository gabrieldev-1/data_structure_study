package arrays.exercises;

public class Reverse {
    public String[] reverseArray(String array[]) {
        String[] newArray = new String[array.length];

        // estrutura "for" com multiplas declaracoes;
        for(int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            newArray[j] = array[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        String[] fruits = {"Maca", "Uva", "Banana"};
        Reverse reverse = new Reverse();
        String[] reversedFruits = reverse.reverseArray(fruits);

        for(String fruit : reversedFruits) {
            System.out.println(fruit);
        }
    }
}