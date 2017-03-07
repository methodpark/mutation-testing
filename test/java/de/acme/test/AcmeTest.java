package de.acme.test;

import static org.junit.Assert.*;
import org.junit.Test;

import de.acme.Acme;

public class AcmeTest {
    Acme a = new Acme();

    @Test
    public void results_greater_than_1_get_turned_into_1() {
        int result = a.acme(100);
        assertEquals(1, result);
    }

    @Test
    public void results_equal_to_minus_100_get_turned_into_0() {
        int result = a.acme(-100);
        assertEquals(0, result);
    }

    @Test
    public void everything_else_gets_incremented() {
        int result = a.acme(-1);
        assertEquals(0, result);
    }
}
