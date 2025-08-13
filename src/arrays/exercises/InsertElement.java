package arrays.exercises;

public class InsertElement { 
    String[] array = new String[0];

    public InsertElement(String[] array) {
        this.array = array;
        
    }
    
    public void insertElementArr(String element) {
        String[] arr = this.array;
        String[] newArray = new String[arr.length + 1];
        
        for(int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];

        }

        newArray[arr.length] = element;
        this.array = newArray;
    }

    public void showArr() {
        String[] arr = this.array;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        String[] array = {"Maca", "Banana", "Pera"};
        InsertElement inserter = new InsertElement(array);

        inserter.insertElementArr("Abacaxi");
        inserter.insertElementArr("Tomate");
        inserter.showArr();

    }
}
