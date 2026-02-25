public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {

        // Hardcoded input string
        String input = "madam";

        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input text: madam");
        System.out.print("Is it a palindrome? ");
        if (isPalindrome) {
            System.out.print("True");
        } else {
            System.out.print(" False");
        }
    }}
