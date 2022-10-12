import static org.junit.jupiter.api.Assertions.assertEquals;
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
        ticTacToe.add("A2X");
        String actual = ticTacToe.arrayTable[0][1];
        String expected = "X";
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
