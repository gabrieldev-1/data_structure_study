package shorting;

public class BubbleShort {
    public void sort(int[] arr) {
        int n = arr.length;
        Boolean swapped;

        for(int i = 0; i < n - 1; i++) {
            swapped = false;

            for(int j = 0; j < n - 1 - i; j++) {
                if(arr[j] != arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }     
            }

            if(!swapped) {
                break;
            }
        }
    }

    public void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] data = { -2, 45, 0, 11, -9 };
        BubbleShort solution = new BubbleShort();
        
        System.out.println("Array original: ");
        solution.printArray(data);

        solution.sort(data);

        System.out.println("Array ordenado: ");
        solution.printArray(data);

    }
}