import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Word = sc.nextLine();
        char[] charArray = Word.toLowerCase().toCharArray();
        boolean isPalindrome = true;
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println("The word \"" + Word + "\" is a Palindrome (Using char array).");
        } else {
            System.out.println("The word \"" + Word + "\" is NOT a Palindrome (Using char array).");
        }
        System.out.println("UC4 Completed Successfully.");
        System.out.println();
    }
}