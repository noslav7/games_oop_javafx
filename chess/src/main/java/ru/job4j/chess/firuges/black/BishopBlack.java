package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class  BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not move by diagonal from %s to %s", position, dest)
            );
        }
        int size = Math.abs(position.getX() - dest.getX());
        Cell[] steps = new Cell[size];
        int deltaX = 0;
        if (dest.getX() > position.getX()) {
            deltaX = 1;
        } else if (dest.getX() < position.getX()) {
            deltaX = -1;
        }
        int deltaY = 0;
        if (dest.getY() > position.getY()) {
            deltaY = 1;
        } else if (dest.getY() < position.getY()){
            deltaY = -1;
        }
        int x = 2;
        int y = 0;
        for (int index = 0; index < size; index++) {
            x = x + deltaX;
            y = y + deltaY;
            steps[index] = Cell.findBy(x, y);
        }
        return steps;
    }

    public boolean isDiagonal (Cell source, Cell dest) throws ImpossibleMoveException {
        boolean diagonal = true;
        int deltaX = Math.abs(position.getX() - dest.getX());
        int deltaY = Math.abs(position.getY() - dest.getY());
        if (deltaX != deltaY) {
            throw new ImpossibleMoveException(
                    String.format("Could not move by diagonal from %s to %s", position, dest)
            );
        }
        return diagonal;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
