package arrays.exercises;

public class CalcAvarege {
    public static void main(String[] args) {
        // Calcular a media dos elementos de um array;
        int numbers[] = {10, 2, 3, 5, 10};
        double sum = 0;


        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }

        double avarage = sum / numbers.length;
        System.out.println(avarage);

    }
}