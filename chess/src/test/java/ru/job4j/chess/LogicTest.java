package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

public class  LogicTest {
    Cell position = Cell.C8;
    BishopBlack blackBishop = new BishopBlack(position);

    @Test(expected = FigureNotFoundException.class)
    public void whenFigureNotFound() throws FigureNotFoundException {
        Logic chessGame = new Logic();
            chessGame.findBy(position);
        }

    @Test(expected = OccupiedCellException.class)
    public void whenCellOcupied() throws OccupiedCellException {
        Cell[] steps = blackBishop.way(position);
        Logic chessGames = new Logic();
            chessGames.free(steps);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenImpossibleMove() {
        blackBishop.way(position);
        }

        @Test
        public void move ()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
            Logic logic = new Logic();
            logic.add(new BishopBlack(Cell.C1));
            logic.move(Cell.C1, Cell.H6);
        }
    }