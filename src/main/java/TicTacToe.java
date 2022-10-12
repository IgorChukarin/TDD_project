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
        }
    }

    public void displayTable() {
        System.out.println(
                "   1   2   3\n" +
                "A _" + arrayTable[0][0] + "_|_" + arrayTable[0][1] + "_|_" + arrayTable[0][2] + "_\n" +
                "B _" + arrayTable[1][0] + "_|_" + arrayTable[1][1] + "_|_" + arrayTable[1][2] + "_\n" +
                "C _" + arrayTable[2][0] + "_|_" + arrayTable[2][1] + "_|_" + arrayTable[2][2] + "_\n"
        );
    }

    public boolean checkWinner() {
        boolean gameIsOn = true;

        String sym1 = arrayTable[0][0];
        String sym2 = arrayTable[0][1];
        String sym3 = arrayTable[0][2];

        String sym4 = arrayTable[1][0];
        String sym5 = arrayTable[1][1];
        String sym6 = arrayTable[1][2];

        String sym7 = arrayTable[2][0];
        String sym8 = arrayTable[2][1];
        String sym9 = arrayTable[2][2];

        if (
                sym1.equals("O") && sym2.equals(sym1) && sym3.equals(sym1) ||
                sym4.equals("O") && sym5.equals(sym1) && sym6.equals(sym1) ||
                sym7.equals("O") && sym8.equals(sym1) && sym9.equals(sym1) ||

                sym1.equals("O") && sym4.equals(sym1) && sym7.equals(sym1) ||
                sym2.equals("O") && sym5.equals(sym1) && sym8.equals(sym1) ||
                sym3.equals("O") && sym6.equals(sym1) && sym9.equals(sym1) ||

                sym1.equals("O") && sym5.equals(sym1) && sym9.equals(sym1) ||
                sym3.equals("O") && sym5.equals(sym1) && sym7.equals(sym1)
        ) {
            gameIsOn = false;
        }
        return gameIsOn;
    }
}
