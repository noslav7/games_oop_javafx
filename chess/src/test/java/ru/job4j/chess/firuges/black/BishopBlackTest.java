package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.assertThat;

public class  BishopBlackTest {

    @Test
    public void correctPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.position();
        assertThat((bishopBlack.position()).equals(Cell.C1));
    }

    @Test
    public void preciseCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Figure anotherBishopBlack = bishopBlack.copy(Cell.F4);
        assertThat((anotherBishopBlack.position()).equals(Cell.F4));
    }

    @Test
    public void way(Cell dest) {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G5);
        assertThat( ? );
    }
}