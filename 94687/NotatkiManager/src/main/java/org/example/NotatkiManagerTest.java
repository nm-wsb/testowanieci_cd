
package org.example;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class NotatkiManagerTest {
    private NotatkiManager manager;

    @Before
    public void setUp() {
        manager = new NotatkiManager();
    }

    @Test
    public void testDodajNotatke() {
        Notatka notatka = new Notatka("Test", "Testowa treść");
        manager.dodajNotatke(notatka);
        List<Notatka> notatki = manager.getNotatki();
        assertEquals(1, notatki.size());
        assertEquals("Test", notatki.get(0).getTytul());
    }

    @Test
    public void testUsunNotatke() {
        Notatka notatka = new Notatka("Test", "Testowa treść");
        manager.dodajNotatke(notatka);
        manager.usunNotatke(notatka);
        assertTrue(manager.getNotatki().isEmpty());
    }

    @Test
    public void testZnajdzNotatke() {
        Notatka notatka = new Notatka("Test", "Testowa treść");
        manager.dodajNotatke(notatka);
        Notatka found = manager.znajdzNotatke("Test");
        assertNotNull(found);
        assertEquals("Test", found.getTytul());
    }

    @Test
    public void testZnajdzNotatkeBrak() {
        Notatka found = manager.znajdzNotatke("Nieistniejąca");
        assertNull(found);
    }

    @Test
    public void testDodajWieleNotatek() {
        manager.dodajNotatke(new Notatka("Test1", "Treść1"));
        manager.dodajNotatke(new Notatka("Test2", "Treść2"));
        assertEquals(2, manager.getNotatki().size());
    }

    @Test
    public void testUsunNieistniejacaNotatke() {
        Notatka notatka1 = new Notatka("Test1", "Treść1");
        Notatka notatka2 = new Notatka("Test2", "Treść2");
        manager.dodajNotatke(notatka1);
        assertEquals(1, manager.getNotatki().size());
        manager.usunNotatke(notatka2); // Usuwamy notatkę, która nie istnieje
        assertEquals(1, manager.getNotatki().size());
    }

    @Test
    public void testDodajNotatkeZKonstruktorze() {
        Notatka notatka = new Notatka("Test", "Treść");
        assertEquals("Test", notatka.getTytul());
        assertEquals("Treść", notatka.getTresc());
    }

    @Test
    public void testPustaListaNotatek() {
        assertTrue(manager.getNotatki().isEmpty());
    }

    @Test
    public void testZawartoscNotatki() {
        Notatka notatka = new Notatka("Test", "Treść");
        manager.dodajNotatke(notatka);
        assertEquals("Treść", manager.znajdzNotatke("Test").getTresc());
    }

    @Test
    public void testDwaIdentyczneTytuly() {
        Notatka notatka1 = new Notatka("Test", "Treść1");
        Notatka notatka2 = new Notatka("Test", "Treść2");
        manager.dodajNotatke(notatka1);
        manager.dodajNotatke(notatka2);
        assertEquals(2, manager.getNotatki().size());
    }

    @Test
    public void testZmienTytulNotatki() {
        Notatka notatka = new Notatka("Test", "Treść");
        manager.dodajNotatke(notatka);
        manager.zmientytul("Test", "Nowy Tytul");
        assertNotNull(manager.znajdzNotatke("Nowy Tytul"));
        assertNull(manager.znajdzNotatke("Test"));
    }

    @Test
    public void testUsunInnaNotatke() {
        manager.dodajNotatke(new Notatka("Test1", "Treść1"));
        manager.dodajNotatke(new Notatka("Test2", "Treść2"));
        manager.usunNotatke(new Notatka("Test1", "Treść1")); // Usunięcie obiektu, który nie jest tym samym obiektem w pamięci
        assertEquals(2, manager.getNotatki().size()); // Wciąż powinno być 2
    }

    @Test
    public void testUsunNotatkiZListy() {
        Notatka notatka1 = new Notatka("Test1", "Treść1");
        Notatka notatka2 = new Notatka("Test2", "Treść2");
        manager.dodajNotatke(notatka1);
        manager.dodajNotatke(notatka2);
        manager.usunNotatke(notatka1);
        assertEquals(1, manager.getNotatki().size());
    }

    @Test
    public void testDodajNullNotatke() {
        try {
            manager.dodajNotatke(null);
            fail("Nie można dodać notatki null");
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }
}