package edu.udg.caes;

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

        Vector res = new Vector();

        final Vector result = new Exercise2().union(a, b);
        assertEquals(result, null);
    }

    @Test
    public void secondNull() {
        Vector a = new Vector();
        a.add(1);
        Vector b = null;

        Vector res = new Vector();

        final Vector result = new Exercise2().union(a, b);
        assertEquals(result, null);
    }

    @Test
    public void no2SameNulls() {
        Vector a = new Vector();
        Vector b = new Vector();
        Vector res = new Vector();

        final Vector result = new Exercise2().union(a, b);
        assertEquals(result, null);
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

        final Vector result = new Exercise2().union(a, b);
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

        Vector res = new Vector();
        res.add(1);
        res.add(2);

        final Vector result = new Exercise2().union(a, b);
        assertEquals(result, null);
    }
}
