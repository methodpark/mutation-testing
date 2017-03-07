package de.acme;

public class Acme {
    public int acme(int i) {
        if (i >= 1) {
            return 1;
        }
        if (i == -100) {
            return 0;
        }
        
        return i + 1;
    }
}
