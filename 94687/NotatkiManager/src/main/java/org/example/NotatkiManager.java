
package org.example;
import java.util.List;
import java.util.ArrayList;

class NotatkiManager {
    private List<Notatka> notatki;

    public NotatkiManager() {
        this.notatki = new ArrayList<>();
    }

    public void dodajNotatke(Notatka notatka) {
        if (notatka == null)
        {
            throw new NullPointerException("null");
        }
        notatki.add(notatka);
    }

    public List<Notatka> getNotatki() {
        return notatki;
    }

    public void usunNotatke(Notatka notatka) {
        notatki.remove(notatka);
    }

    public Notatka znajdzNotatke(String tytul) {
        for (Notatka n : notatki) {
            if (n.getTytul().equals(tytul)) {
                return n;
            }
        }
        return null;
    }

    public void zmientytul (String stary, String nowy)
    {
        this.znajdzNotatke(stary).setTytul(nowy);
    }
}