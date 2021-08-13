package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

   @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        try {
            logic.move(Cell.C1, Cell.H6);
        } catch (FigureNotFoundException ffe) {
            ffe.printStackTrace();
        } catch (OccupiedCellException oce) {
            oce.printStackTrace();
        } catch (ImpossibleMoveException ime) {
            ime.printStackTrace();
        }
    }
}