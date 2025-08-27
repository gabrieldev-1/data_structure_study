package arrays.exercises;

public class LongestSubarrayOne {
    public int searchSubarray(int[] array) {
        int max = 0;
        int left = 0;
        int right = 0;
        int zeros = 0;

        // The 'right' pointer expands the window
        while(right < array.length) {
            // If the element is 0, increment the zeros counter
            if(array[right] == 0) {
                zeros++;
            }

            // If the window contains more than one zero, contract it from the left
            while(zeros > 1) {
                if(array[left] == 0) {
                    zeros--;
                }
                left++;
            }

            // Calculate the current window length and update max
            int currentLength = right - left;
            if (currentLength > max) {
                max = currentLength;
            }

            right++;
        }
        
        // Final adjustment for arrays with no zeros to account for the single zero removal
        if (zeros == 0) {
            return max;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 1, 1, 1};
        LongestSubarrayOne solution = new LongestSubarrayOne();

        int maxSubarr = solution.searchSubarray(nums);
        System.out.println(maxSubarr); // Should print 6
    }
}