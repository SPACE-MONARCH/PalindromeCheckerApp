public class PalindromeCheckerApp {
    public static void main(String[] args){
        String Word = "madam";
        String Reversed = "";
        for (int i = Word.length() - 1; i >= 0 ;  i--) {
            Reversed += Word.charAt(i);
        }
        if (Word.equals(Reversed)) {
            System.out.println("The word \"" + Word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + Word + "\" is NOT a Palindrome.");
        }
        System.out.println("UC2 Completed Successfully.");
        System.out.println();
    }
}