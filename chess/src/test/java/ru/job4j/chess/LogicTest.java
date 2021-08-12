package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test
    public void whenFigureNotFoundException {
        try (...) {

        } catch (FigureNotFoundException fe) {
            fe.printStackTrace();
        }
    }

    @Test
    public void whenImpossibleMoveException {
        try (...) {

        } catch (ImpossibleMoveException ime) {
            ime.printStackTrace();
        }
    }

    @Test
    public void whenOccupiedCellException {
        try (...) {

        } catch (OccupiedCellException oce) {
            oce.printStackTrace();
        }
    }

    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }
}