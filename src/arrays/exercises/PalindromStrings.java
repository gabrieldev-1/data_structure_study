// algoritimo: "Two Pointer"

package arrays.exercises;

public class PalindromStrings {
    public boolean isPalindrome(String word) {
        char[] strArr = word.toCharArray(); // transforma a string em um array de caracteres
        int left = 0;
        int right = strArr.length - 1;

        while(left < right) {

            if(strArr[left] != strArr[right]) {
                return false;

            }
            left++;
            right--;

        }
        return true;
    }


    public static void main(String[] args) {

        PalindromStrings solution = new PalindromStrings();
        boolean result = solution.isPalindrome("radar");

        System.out.println(result);
    }
}
