import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean gameIsOn = true;
        TicTacToe ticTacToe = new TicTacToe();
        Scanner in = new Scanner(System.in);

        while (gameIsOn) {
            ticTacToe.displayTable();
            String input = in.nextLine();

            if (!inputIsCorrect(input)) {
                System.out.println("Неверная команда!");
                continue;
            }

            ticTacToe.add(input);
            gameIsOn = ticTacToe.checkWinner();
            if (gameIsOn == false) {
                ticTacToe.displayTable();
            }
        }
    }

    public static boolean inputIsCorrect(String input) {
        if (input.length() != 3) {
            return false;
        }
        if (input.charAt(0) != 'A' && input.charAt(0) != 'B' && input.charAt(0) != 'C') {
            return false;
        }
        if (!Character.isDigit(input.charAt(1))) {
            return false;
        }
        if (input.charAt(2) != 'O' && input.charAt(2) != 'X') {
            return false;
        }
        return true;
    }
}
