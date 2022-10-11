public class TicTacToe {
    public String[][] arrayTable = {{"_", "_", "_"}, {"_", "_", "_"}, {"_", "_", "_"}};

    public void add(String letterNumberSymbol) {

        int x = 0;
        int y = 0;

        if (letterNumberSymbol.charAt(0) == 'A') {
            x = 0;
        } else if (letterNumberSymbol.charAt(0) == 'B') {
            x = 1;
        } else if (letterNumberSymbol.charAt(0) == 'C') {
            x = 2;
        }
        y = (int) letterNumberSymbol.charAt(1) - 49;

        if (arrayTable[x][y] == "_") {
            arrayTable[x][y] = letterNumberSymbol.substring(2);
        } else {
            System.out.println("Эта клетка уже занята!");
        }
    }
}
