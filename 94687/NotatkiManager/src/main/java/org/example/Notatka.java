
package org.example;
public class Notatka {
    private String tytul;
    private String tresc;

    public Notatka(String tytul, String tresc) {
        this.tytul = tytul;
        this.tresc = tresc;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul)
    {
        this.tytul = tytul;
    }


    public String getTresc() {
        return tresc;
    }
}


