// nry albumu: 94681 Grelak, 95958 Garlicki, 94687 Basista, 96065 Majewski
package org.example;

public class Main {
    public static void main(String[] args)
    {
        try {
            NotatkiManagerTest test = new NotatkiManagerTest();
            test.setUp();
            test.testDodajNotatke();

            test.setUp();
            test.testUsunNotatke();

            test.setUp();
            test.testZnajdzNotatke();

            test.setUp();
            test.testZnajdzNotatkeBrak();

            test.setUp();
            test.testDodajWieleNotatek();

            test.setUp();
            test.testUsunNieistniejacaNotatke();

            test.setUp();
            test.testDodajNotatkeZKonstruktorze();

            test.setUp();
            test.testPustaListaNotatek();

            test.setUp();
            test.testZawartoscNotatki();

            test.setUp();
            test.testDwaIdentyczneTytuly();

            test.setUp();
            test.testZmienTytulNotatki();

            test.setUp();
            test.testUsunInnaNotatke();

            test.setUp();
            test.testUsunNotatkiZListy();

            test.setUp();
            test.testDodajNullNotatke();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}