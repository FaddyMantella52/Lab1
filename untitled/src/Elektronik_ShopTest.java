import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Elektronik_ShopTest {

    @Test
    void billigste() {
        Elektronik_Shop elektronik_shop = new Elektronik_Shop();
        int[] tastatur = new int[]{40, 35, 70, 15, 45};
        assertEquals(15, elektronik_shop.billigste(tastatur));
    }

    @Test
    void teuerste() {
        Elektronik_Shop elektronik_shop = new Elektronik_Shop();
        int[] tastatur = new int[]{15, 20, 10, 35};
        int[] USB = new int[]{20, 15, 40, 15};
        assertEquals(40, elektronik_shop.teuerste(tastatur, USB));
    }

    @Test
    void teursteMarkus() {
        Elektronik_Shop elektronik_shop = new Elektronik_Shop();
        int[] preise = new int[]{15, 45, 20};
        int budget = 30;
        assertEquals(20, elektronik_shop.teursteMarkus(preise, budget));
    }

    @Test
    void budgetMarkus() {
        Elektronik_Shop elektronik_shop = new Elektronik_Shop();
        int[] tastatur = new int[] {40,50,60};
        int[] USB = new int[] {8,12};
        assertEquals(58,elektronik_shop.budgetMarkus(tastatur,USB,60));
        assertEquals(-1,elektronik_shop.budgetMarkus(tastatur,USB,20));
    }
}