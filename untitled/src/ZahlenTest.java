import static org.junit.jupiter.api.Assertions.*;

class ZahlenTest {

    @org.junit.jupiter.api.Test
    void maxZahl() {
        Zahlen _zahlen = new Zahlen();
        int[] zahlen = new int[] {10,34,54,20,-100};
        assertEquals(54,_zahlen.maxZahl(zahlen));
        int[] zahlen2 = new int[] {};
        assertThrows(IllegalArgumentException.class, () ->{
            _zahlen.maxZahl(zahlen2);
        });
    }

    @org.junit.jupiter.api.Test
    void minZahl() {
        Zahlen _zahlen = new Zahlen();
        int [] zahlen = new int[] {10,34,54,20,-100};
        assertEquals(-100,_zahlen.minZahl(zahlen));
        int[] zahlen2 = new int[] {};
        assertThrows(IllegalArgumentException.class, () ->{
            _zahlen.minZahl(zahlen2);
        });
    }
    @org.junit.jupiter.api.Test
    void maxSumme() {
        Zahlen _zahlen = new Zahlen();
        int [] zahlen = new int[] {10,34,54,20,-100};
        assertEquals(118,_zahlen.maxSumme(zahlen));
        int[] zahlen2 = new int[] {};
        assertThrows(IllegalArgumentException.class, () ->{
            _zahlen.maxSumme(zahlen2);
        });
    }

    @org.junit.jupiter.api.Test
    void minSumme() {
        Zahlen _zahlen = new Zahlen();
        int [] zahlen = new int[] {10,34,54,20,-100};
        assertEquals(-36,_zahlen.minSumme(zahlen));
        int[] zahlen2 = new int[] {};
        assertThrows(IllegalArgumentException.class, () ->{
            _zahlen.minSumme(zahlen2);

        });
    }
}