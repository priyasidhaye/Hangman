import java.util.*;
import java.io.*;

public class Hangman {
    private String word;
    private Letter[] letters;
    private ArrayList<Letter> allGuessedLetters;
    private int numberOfIncorrectGuesses;
    private int totalGuesses;
    private boolean isGameWon;
    private boolean isGameLost;
    private DisplayHangman display;
    
    public Hangman() {
        this.totalGuesses = 10;
        this.allGuessedLetters = new ArrayList<Letter>(26);
        this.display = new DisplayHangman();

        // Read a random word from file. Assign default word if read fails.
        try {
            FileReader fileReader = new FileReader(new File("D:\\Hangman\\words.txt"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Random rand = new Random();
            int n = rand.nextInt(50) + 1;
            for (int i=0; i<n; i++) {
                this.word = bufferedReader.readLine().trim();
            }
        } catch (Exception e) {
            //Default word
            this.word = "codswallop";
        }
        this.letters = new Letter[this.word.length()];
        for(int i=0; i<this.word.length(); i++) {
            letters[i] = new Letter(this.word.charAt(i));
        } 
    }

    private void displayGame() {
        this.display.displayHangman(this.numberOfIncorrectGuesses);
        for (int i=0; i<word.length(); i++) {
            if(this.letters[i].getIsGuessed()) {
                System.out.print(letters[i].getValue());
            } else {
                System.out.print('_');
            }
            System.out.print(' ');
        }
        System.out.println('\n');
    }

    private boolean isAlreadyGuessed(char inputLetter) {
        boolean alreadyGuessed = false;
        for (Letter l : this.allGuessedLetters) {
            if (l.getValue() == inputLetter) {
                alreadyGuessed = true;
                if (l.getIsGuessed()) {
                    // Already guessed twice
                    System.out.println("Letter already guessed at least twice.");
                    this.numberOfIncorrectGuesses++;
                    if (this.numberOfIncorrectGuesses == this.totalGuesses) {
                        this.isGameLost = true;
                    }
                } else {
                    // Guessed once
                    // If it has already been guessed return once - issue warning
                    l.setIsGuessed();
                    System.out.println("Warning: Letter already guessed."); 
                }
            }
        }
        return alreadyGuessed;
    }

    private void determineOutcome(String input) {
        // check if word or letter
        if (input.length() > 1) {
            if (input.equals(this.word)) {
                // if word check if guess is correct-if yes game won
                this.isGameWon = true;
            } else {
                // if wrong increase numberOfIncorrectGuesses. Check if game is lost.
                this.numberOfIncorrectGuesses++;
                if (this.numberOfIncorrectGuesses == this.totalGuesses) {
                    this.isGameLost = true;
                }
            }
            return;
        } else if(input.length() == 1) {
            char inputLetter = input.charAt(0);
            boolean guessed = this.isAlreadyGuessed(inputLetter);
            if (guessed) {
                return;
            } else {
                if (!guessed) {
                    // If it has not been guessed yet - add to allGuessedLetters
                    this.allGuessedLetters.add(new Letter(inputLetter));
                }
                // check if it is part of the word
                // If yes, set isGuessed to True and return to beginning. Check if game is won
                // If not, increase numberOfIncorrectGuesses. Check if game is lost.
                boolean letterInWord = false;
                for(int i=0; i<this.letters.length; i++) {
                    if (inputLetter == this.letters[i].getValue()) {
                        letterInWord = true;
                        this.letters[i].setIsGuessed();
                    }
                }
                if (!letterInWord) {
                    this.numberOfIncorrectGuesses++;
                    if (this.numberOfIncorrectGuesses == this.totalGuesses) {
                        this.isGameLost = true;
                    }
                }
            }
        }
    }

    private boolean isValidInput(String input) {
        return input.matches("[a-zA-Z]+");
    }

    public void playGame() {
        Scanner in = new Scanner(System.in);        
        while(!this.isGameWon && !this.isGameLost) {
            // Output current state of hangman
            this.displayGame();
            System.out.println("Enter guess(Letter or Word) : ");
            // Ask for input letter or word
            String input = in.next().trim().toLowerCase();
            boolean valid = this.isValidInput(input);
            if (valid) {
                input = input.toLowerCase();
                this.determineOutcome(input);    
            } else {
                System.out.println("Invalid input");
            }
        }
        //Output if game won or lost
        if (this.isGameLost) {
            this.display.displayHangman(10);
            System.out.println("You lost!");
            System.out.println("Word was : " + this.word);
        } else if (this.isGameWon) {
            this.display.displayHangman(-1);
            System.out.println("Congratulations! Game won.");
        }
    }

    public static void main(String args[]) {
        Hangman game = new Hangman();
        
        // Test Initialization
        if (game.word != null) {
            System.out.println("Game initialized");
        } else {
            System.out.println("Game initialization failed");
        }

        // Test valid input
        if (!game.isValidInput("45")) {
            System.out.println("Invalid input test passed");
        } else {
            System.out.println("Invalid input test failed");
        }
    }
}