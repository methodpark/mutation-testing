package de.acme.test;

import static org.junit.Assert.*;
import org.junit.Test;

import de.acme.Acme;

public class AcmeTest {
    Acme a = new Acme();

    @Test
    public void factorial_with_1_returns_1() {
        int result = a.factorial(1);
        assertEquals(1, result);
    }

    @Test
    public void factorial_with_0_returns_1() {
        int result = a.factorial(0);
        assertEquals(1, result);
    }

    @Test
    public void factorial_with_5_returns_120() {
        int result = a.factorial(5);
        assertEquals(120, result);
    }
}
