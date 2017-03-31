package de.acme.test;

import static org.junit.Assert.*;
import org.junit.Test;

import de.acme.Acme;

public class AcmeTest {
    Acme a = new Acme();

    @Test
    public void qualifiesForDiscount_returns_false_for_a_minor_amount() {
        boolean qualified = a.qualifiesForDiscount(20);
        assertFalse(qualified);
    }

    @Test
    public void qualifiesForDiscount_returns_true_for_a_big_enough_amount() {
        boolean qualified = a.qualifiesForDiscount(100);
        assertTrue(qualified);
    }
}
