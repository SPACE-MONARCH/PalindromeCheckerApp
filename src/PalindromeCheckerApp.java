import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "civic";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            queue.offer(c);
            stack.push(c);
        }
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (queue.poll() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input: " + input + " is " + (isPalindrome ? "a palindrome." : "not a palindrome."));
        System.out.println("UC6 Completed Successfully.");
    }
}