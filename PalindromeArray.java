
public class PalindromeArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};

        boolean isPalindrome = isPalindrome(arr);

        if (isPalindrome) {
            System.out.println("Array is a palindrome");
        } else {
            System.out.println("Array is not a palindrome");
        }
    }

    public static boolean isPalindrome(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}
