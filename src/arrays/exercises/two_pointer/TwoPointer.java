package arrays.exercises.two_pointer;

public class TwoPointer {

    public String invertString(String str) {
        char[] arr = this.transformInArr(str);
        int l = 0;
        int r = arr.length - 1;

        while(l != r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        
        String strResult = this.transformInString(arr);
        return strResult;
    }

    private char[] transformInArr(String str) {
        char[] strArr = new char[str.length()];


        for(int i = 0; i < str.length(); i++) {
            strArr[i] = str.charAt(i);

        }

        return strArr;
    }

    private String transformInString(char[] arr) {
        String str = "";
        for(int i = 0; i < arr.length; i++) {
            str = str + arr[i];

        }

        return str;
    }

    public void showArr(char[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        TwoPointer invert = new TwoPointer();
        String hello = "Hello World";

        String olleh = invert.invertString(hello);
        System.out.println(olleh);

    }
}