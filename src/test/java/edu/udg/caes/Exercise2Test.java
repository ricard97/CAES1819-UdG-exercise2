package edu.udg.caes;

import java.util.InputMismatchException;
import java.util.Vector;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exercise2Test {

    @Test
    public void be() {

        Vector a = new Vector();
        a.add(1);

        Vector b = new Vector();
        b.add(1);
        b.add(2);

        Vector res = new Vector();
        res.add(1);
        res.add(1);
        res.add(2);

        final Vector result = new Exercise2().union(a, b);
        assertEquals(result, res);
    }

    @Test
    public void firstNull() {
        Vector a = null;
        Vector b = new Vector();
        b.add(1);

        assertThrows(IllegalArgumentException.class, () -> Exercise2.union_final(a,b));
    }

    @Test
    public void secondNull() {
        Vector a = new Vector();
        a.add(1);
        Vector b = null;

        assertThrows(IllegalArgumentException.class, () -> Exercise2.union_final(a,b));
    }

    @Test
    public void no2SameNulls() {
        Vector a = null;
        Vector b = null;

        assertThrows(IllegalArgumentException.class, () -> Exercise2.union_final(a,b));
    }

    @Test
    public void noRepeats() {
        Vector a = new Vector();
        a.add(1);

        Vector b = new Vector();
        b.add(1);
        b.add(2);

        Vector res = new Vector();
        res.add(1);
        res.add(2);

        final Vector result = new Exercise2().union_final(a, b);
        assertEquals(result, res);
    }

    @Test
    public void sameType() {
        Vector a = new Vector();
        a.add("r");
        a.add("t");

        Vector b = new Vector();
        b.add(1);
        b.add(2);

        assertThrows(InputMismatchException.class, () -> Exercise2.union_final(a,b));
    }
}
