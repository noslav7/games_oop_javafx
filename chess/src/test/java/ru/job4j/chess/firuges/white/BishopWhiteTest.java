package ru.job4j.chess.firuges.white;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopWhiteTest {

    @Test
    public void position() {
        BishopWhite bishopWhite = new BishopWhite(Cell.C1);


    }

    @Test
    public Cell[] way(Cell[] dest) {
        int size = ...;
        Cell[] steps = new Cell[size];
        int deltaX = ...;
        int deltaY = ...;
        for (int index = 0; index < size; index++) {
            steps[index] = ...;
        }
        return steps;
    }

    @Test
    public void copy() {
    }
}