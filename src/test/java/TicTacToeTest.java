import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование методов класса игры")
public class TicTacToeTest {
    TicTacToe ticTacToe = new TicTacToe();

    @Test
    @DisplayName("Нарисовать O")
    public void testAddO() {
        ticTacToe.add("A1O");
        String actual = ticTacToe.arrayTable[0][0];
        String expected = "O";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Нарисовать X")
    public void testAddX() {
        ticTacToe.add("B2X");
        String actual = ticTacToe.arrayTable[1][1];
        String expected = "X";
        assertEquals(expected, actual);

        ticTacToe.add("C3X");
        actual = ticTacToe.arrayTable[2][2];
        expected = "X";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Выбор занятой клетки")
    public void testAddOnOccupiedPlace() {
        ticTacToe.add("A1O");
        ticTacToe.add("A1X");
        String actual = ticTacToe.arrayTable[0][0];
        String expected = "O";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Вывод игрового поля в консоль")
    public void testDisplayTable() {
        String actual = ticTacToe.displayTable();
        String expected = "   1   2   3\n" +
                "A ___|___|___\n" +
                "B ___|___|___\n" +
                "C ___|___|___\n";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Проверка победных ситуаций")
    public void testCheckWinner() {
        ticTacToe.add("A1O");
        ticTacToe.add("A2O");
        ticTacToe.add("A3O");
        boolean actual = ticTacToe.checkWinner();
        assertFalse(actual);
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
