/* Class calls test methods from Letter and Hangman classes */

public class HangmanTest {
    public static void main(String args[]) {
        Letter.testInitialization();
        Hangman.testInitialization();
        Hangman.testValidInput();
        Hangman.testAlreadyGuessed();
        Hangman.testDetermineOutcome();
        String x = "";
        System.out.println(x.charAt(0));
    }
}