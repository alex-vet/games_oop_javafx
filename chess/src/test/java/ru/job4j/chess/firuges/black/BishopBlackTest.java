package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {
    @Test
    public void whenPositionIsA1() {
        BishopBlack figure = new BishopBlack(Cell.A1);
        assertThat(figure.position(),is(Cell.A1));
    }

    @Test
    public void WhenCopyToCellB2() {
        BishopBlack figure = new BishopBlack(Cell.A1);
        Figure newFigure =  figure.copy(Cell.B2);
        assertThat(newFigure.position() ,is(Cell.B2));
    }

    @Test
    public void whenWayIsC1ToG5() throws ImpossibleMoveException {
        Cell[] output = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        BishopBlack figure = new BishopBlack(Cell.C1);
        Cell[] pos = figure.way(Cell.G5);
        assertThat(pos,is(output));
    }
}