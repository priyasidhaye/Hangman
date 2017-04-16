/* This class displays the ASCII hangman based on number of incorrectly guessed letters.*/
public class DisplayHangman {
    public static void displayHangman(int numberOfWrongGuesses) {
        switch (numberOfWrongGuesses) {
            case 0:
                System.out.println("|--------|");
                System.out.println("|        |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|------------------");
                break;
            
             case 1:
                System.out.println("|--------|");
                System.out.println("|        |");
                System.out.println("|       ***");
                System.out.println("|     *     *");
                System.out.println("|    /       \\");
                System.out.println("|    (       )");
                System.out.println("|     *     *");
                System.out.println("|       ***");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("-------------------");
                break;

            case 2:
                System.out.println("|--------|");
                System.out.println("|        |");
                System.out.println("|       ***");
                System.out.println("|     *     *");
                System.out.println("|    / 0     \\");
                System.out.println("|    (       )");
                System.out.println("|     *     *");
                System.out.println("|       ***");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("-------------------");
                break;

            case 3:
                System.out.println("|--------|");
                System.out.println("|        |");
                System.out.println("|       ***");
                System.out.println("|     *     *");
                System.out.println("|    / 0   0 \\");
                System.out.println("|    (       )");
                System.out.println("|     *     *");
                System.out.println("|       ***");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("-------------------");
                break;

            case 4:
                System.out.println("|--------|");
                System.out.println("|        |");
                System.out.println("|       ***");
                System.out.println("|     *     *");
                System.out.println("|    / 0   0 \\");
                System.out.println("|    (   o   )");
                System.out.println("|     *     *");
                System.out.println("|       ***");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("-------------------");
                break;

            case 5:
                System.out.println("|--------|");
                System.out.println("|        |");
                System.out.println("|       ***");
                System.out.println("|     *     *");
                System.out.println("|    / 0   0 \\");
                System.out.println("|    (   o   )");
                System.out.println("|     *  O  *");
                System.out.println("|       ***");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("-------------------");
                break;

            case 6:
                System.out.println("|--------|");
                System.out.println("|        |");
                System.out.println("|       ***");
                System.out.println("|     *     *");
                System.out.println("|    / 0   0 \\");
                System.out.println("|    (   o   )");
                System.out.println("|     *  O  *");
                System.out.println("|       ***");
                System.out.println("|        |");
                System.out.println("|        |");
                System.out.println("|        |");
                System.out.println("|        |");
                System.out.println("|        |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("-------------------");
                break;

            case 7:
                System.out.println("|--------|");
                System.out.println("|        |");
                System.out.println("|       ***");
                System.out.println("|     *     *");
                System.out.println("|    / 0   0 \\");
                System.out.println("|    (   o   )");
                System.out.println("|     *  O  *");
                System.out.println("|     \\ ***");
                System.out.println("|      \\ |");
                System.out.println("|       \\|");
                System.out.println("|        |");
                System.out.println("|        |");
                System.out.println("|        |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("-------------------");
                break;

            case 8:
                System.out.println("|--------|");
                System.out.println("|        |");
                System.out.println("|       ***");
                System.out.println("|     *     *");
                System.out.println("|    / 0   0 \\");
                System.out.println("|    (   o   )");
                System.out.println("|     *  O  *");
                System.out.println("|     \\ *** /");
                System.out.println("|      \\ | /");
                System.out.println("|       \\|/");
                System.out.println("|        |");
                System.out.println("|        |");
                System.out.println("|        |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("-------------------");
                break;

            case 9:
                System.out.println("|--------|");
                System.out.println("|        |");
                System.out.println("|       ***");
                System.out.println("|     *     *");
                System.out.println("|    / 0   0 \\");
                System.out.println("|    (   o   )");
                System.out.println("|     *  O  *");
                System.out.println("|     \\ *** /");
                System.out.println("|      \\ | /");
                System.out.println("|       \\|/");
                System.out.println("|        |");
                System.out.println("|        |");
                System.out.println("|        |");
                System.out.println("|       /");
                System.out.println("|      /");
                System.out.println("|     /");
                System.out.println("|    /");
                System.out.println("|");
                System.out.println("|");
                System.out.println("-------------------");
                break;

            case 10:
                System.out.println("|--------|");
                System.out.println("|        |");
                System.out.println("|       ***");
                System.out.println("|     *     *");
                System.out.println("|    / X   X \\");
                System.out.println("|    (   o   )");
                System.out.println("|     *  -  *");
                System.out.println("|       ***");
                System.out.println("|        |");
                System.out.println("|        |");
                System.out.println("|       /|\\");
                System.out.println("|      / | \\");
                System.out.println("|     /  |  \\");
                System.out.println("|       / \\");
                System.out.println("|      /   \\");
                System.out.println("|     /     \\");
                System.out.println("|    /       \\");
                System.out.println("|");
                System.out.println("|");
                System.out.println("-------------------");
                break;

            case -1:
                System.out.println("|--------|");
                System.out.println("|        |");
                System.out.println("|       ***");
                System.out.println("|     *     *");
                System.out.println("|    / 0   0 \\");
                System.out.println("|    (   o   )");
                System.out.println("|     * \\_/ *");
                System.out.println("|     \\ *** /");
                System.out.println("|      \\ | /");
                System.out.println("|       \\|/");
                System.out.println("|        |");
                System.out.println("|        |");
                System.out.println("|        |");
                System.out.println("|       / \\");
                System.out.println("|      /   \\");
                System.out.println("|     /     \\");
                System.out.println("|    /       \\");
                System.out.println("|");
                System.out.println("|");
                System.out.println("-------------------");
                break;

        }
    }
}