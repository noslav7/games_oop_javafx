package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class  BishopBlackTest {

    @Test
    public void correctPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.position();
        assertTrue(bishopBlack.position() == Cell.C1);
    }

    @Test
    public void preciseCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Figure anotherBishopBlack = bishopBlack.copy(Cell.F4);
        assertTrue(anotherBishopBlack.position() == Cell.F4);
    }

    @Test
    public void way(Cell dest) {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G5);
        assertTrue( ? );
    }
}