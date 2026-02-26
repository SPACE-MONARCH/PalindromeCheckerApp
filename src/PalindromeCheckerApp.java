import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String Word = "Level";
        String lowerCase = Word.toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < lowerCase.length(); i++) {
            stack.push(lowerCase.charAt(i));
        }
        String Reversed = "";
        while (!stack.isEmpty()) {
            Reversed = Reversed + stack.pop();
        }
        if (lowerCase.equals(Reversed)) {
            System.out.println("UC5: The word \"" + Word + "\" is a Palindrome (Using Stack).");
        } else {
            System.out.println("UC5: The word \"" + Word + "\" is NOT a Palindrome (Using Stack).");
        }
        System.out.println("UC5 Completed Successfully.");
    }
}