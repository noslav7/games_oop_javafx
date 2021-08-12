package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.junit.Assert.*;

public class  BishopBlackTest {

    @Test
    public void correctPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell expected = bishopBlack.position();
        assertTrue(expected.equals(Cell.C1));
    }

    @Test
    public void preciseCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Figure anotherBishopBlack = bishopBlack.copy(Cell.F4);
        assertTrue((anotherBishopBlack.position()).equals(Cell.F4));
    }

    @Test
    public void way(Cell dest) {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = bishopBlack.way(Cell.G5);
        assertArrayEquals(expected, new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5});
    }
}