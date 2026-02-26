import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "refer";
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.offerLast(c);
        }
        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input: " + input + " is " + (isPalindrome ? "a palindrome." : "not a palindrome."));
        System.out.println("UC7 Completed Successfully.");
    }
}