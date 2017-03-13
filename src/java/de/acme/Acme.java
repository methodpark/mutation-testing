package de.acme;

public class Acme {
    public boolean qualifiesForDiscount(long price) {
        if (price >= 50) {
            return true;
        }
        return false;
    }
}
