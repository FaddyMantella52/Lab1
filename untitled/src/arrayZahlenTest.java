import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class arrayZahlenTest {

    @Test
    void sum() {
        arrayZahlen ArrayZahlen = new arrayZahlen();
        int[] zahl1 = new int [] {5,0,0,0,0,0,0,0,0};
        int[] zahl2 = new int [] {8,7,0,0,0,0,0,0,0};
        int[] expected = {1,3,7,0,0,0,0,0,0,0};
        assertEquals(Arrays.toString(expected),Arrays.toString(ArrayZahlen.sum(zahl1,zahl2)));
        int[] zahl3 = new int[] {};
        int[] zahl4 = new int[] {};
        assertThrows(IllegalArgumentException.class, () ->{
            arrayZahlen.sum(zahl3,zahl4);});
    }

    @Test
    void sub() {
        arrayZahlen ArrayZahlen = new arrayZahlen();
        int[] zahl1 = new int [] {5,0,0,0,0,0,0,0,0};
        int[] zahl2 = new int [] {8,7,0,0,0,0,0,0,0};
        int[] expected = {-3,7,0,0,0,0,0,0,0};
        assertEquals(Arrays.toString(expected),Arrays.toString(ArrayZahlen.sub(zahl1,zahl2)));
        int[] zahl3 = new int[] {};
        int[] zahl4 = new int[] {};
        assertThrows(IllegalArgumentException.class, () ->{
            arrayZahlen.sub(zahl3,zahl4);});
    }

    @Test
    void mul() {
        arrayZahlen ArrayZahlen = new arrayZahlen();
        int[] array  = new int [] {4,0,0,0,0,0,0,0};
        int digit = 4;
        int[] expected = {1,6,0,0,0,0,0,0,0};
        assertEquals(Arrays.toString(expected),Arrays.toString(ArrayZahlen.mul(array,digit)));
        assertThrows(IllegalArgumentException.class, () ->{
            arrayZahlen.mul(array,15);});
    }

    @Test
    void div() {
        arrayZahlen ArrayZahlen = new arrayZahlen();
        int[] array  = new int [] {4,0,0,0,0,0,0,0};
        int digit = 4;
        int[] expected = {1,0,0,0,0,0,0,0};
        assertEquals(Arrays.toString(expected),Arrays.toString(ArrayZahlen.div(array,digit)));
        assertEquals(Arrays.toString(expected),Arrays.toString(ArrayZahlen.div(array,digit)));
        assertThrows(IllegalArgumentException.class, () ->{
            arrayZahlen.div(array,15);});
    }
}