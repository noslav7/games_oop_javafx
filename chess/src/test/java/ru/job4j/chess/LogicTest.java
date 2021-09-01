package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

public class  LogicTest {

    @Test(expected = FigureNotFoundException.class)
    public void whenFigureNotFound()
            throws FigureNotFoundException, ImpossibleMoveException, OccupiedCellException {
        Logic logic = new Logic();
        logic.move(Cell.C1, Cell.H6);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenImpossibleMove()
            throws FigureNotFoundException, ImpossibleMoveException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.C5);
    }

    @Test(expected = OccupiedCellException.class)
    public void whenCellOccupied()
            throws FigureNotFoundException, ImpossibleMoveException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.D2));
        logic.move(Cell.C1, Cell.E3);
    }

        @Test
        public void move ()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
            Logic logic = new Logic();
            logic.add(new BishopBlack(Cell.C1));
            logic.move(Cell.C1, Cell.H6);
        }
    }