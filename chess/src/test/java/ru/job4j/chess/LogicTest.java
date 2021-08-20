package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

public class  LogicTest {

    @Test(expected = FigureNotFoundException.class)
    private int findBy(Cell cell) throws FigureNotFoundException {
        final Figure[] figures = new Figure[32];
        for (int index = 0; index != figures.length; index++) {
            Figure figure = figures[index];
            if (figure != null && figure.position().equals(cell)) {
                return index;
            }
        }
        throw new FigureNotFoundException();
    }

    @Test(expected = OccupiedCellException.class)
    private boolean free(Cell[] steps) throws OccupiedCellException {
        final Figure[] figures = new Figure[32];
        for (int j = 0; j < figures.length; j++) {
            for (int k = 0; k < steps.length; k++) {
                if (figures[j] != null && figures[j].equals(steps[k])) {
                    throw new OccupiedCellException();
                }
            }
        }
        return true;
    }

    @Test(expected = ImpossibleMoveException.class)
    public void way(Cell dest) {
        Cell position = null;
        BishopBlack bishB = new BishopBlack(Cell.C8);
        if (!bishB.isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not move by diagonal from %s to %s", position, dest)
            );
        }
    }

        @Test
        public void move ()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
            Logic logic = new Logic();
            logic.add(new BishopBlack(Cell.C1));
            logic.move(Cell.C1, Cell.H6);
        }
    }