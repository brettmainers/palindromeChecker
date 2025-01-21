import java.util.Scanner;

public class Main {
     public static void main (String[] args) {

        // Creating a scanner object to take user input, and then prompting the user to enter a word
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word and we will check if it is a palindrome! Make sure to use lowercase letters only.");

        String word = input.nextLine();

        // Checking if the word is a palindrome
        boolean isPalindrome = PalindromeChecker.isPalindrome(word, 0, word.length()-1);
        boolean keepLooping = true;

        // Loop to allow the user to continue entering words and keep track of their palindrome streak
        for (int i = 1; keepLooping; i++) {

            // Condition statements that print whether or not the word is a palindrome,
            // prompt the user to enter another word, and keep count of their palindrome streak
            if (isPalindrome == true) {
            
                if (i == 1) {
                    System.out.println("Congratulations, The word you entered is a palindrome! Would you like to enter another word? Type 'Yes' or 'No'");
                } else if (i == 2) {
                    System.out.println("Wow, you're on a roll! Would you like to keep going? Type 'Yes' or 'No'");
                } else if (i == 3) {
                    System.out.println("Nice, 3 in a row! Do you wanna try for 4? Type 'Yes' or 'No'");
                } else if (i > 3) {
                    System.out.println("You're on fire! You have entered " + i + " palindromes in a row. Would you like to try and keep the streak going? Type 'Yes' or 'No'");
                }
            } 
            else {
                if (i <= 2) {
                System.out.println("Sorry, The word you entered is not a palindrome. Would you like to try again? Type 'Yes' or 'No'");
                i = 0;
                } else {
                System.out.println("Oh no, you lost your streak! Would you like to try again? Type 'Yes' or 'No'");
                i = 0;
                }
            }

            boolean validInput = false;

            // Loop until the user enters a valid input: "Yes" or "No"
            while (validInput == false) {

                String response = input.nextLine();

                // If the user enters "Yes", the program prompts them to enter another word and checks if it is a palindrome.
                // If the user enters "No", the program ends and prints the user's palindrome streak. 
                if (response.equalsIgnoreCase("Yes")){
                    System.out.println("Enter your next word.");
                    String nextWord = input.nextLine();
                    isPalindrome = PalindromeChecker.isPalindrome(nextWord, 0, nextWord.length()-1);
                    keepLooping = true;
                    validInput = true;
                } else if (response.equalsIgnoreCase("No")) {
                    if (i == 1) {
                        System.out.println("Ok, Goodbye. You ended with a streak of 1 palindrome.");
                    } else {
                        System.out.println("Ok, Goodbye. You ended with a streak of " + i + " palindromes!");
                    }
                    keepLooping = false;
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please type 'Yes' or 'No'");
                }
            }
        }
        input.close(); // Closing the scanner object
    }
}