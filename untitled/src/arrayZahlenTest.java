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
    }

    @Test
    void sub() {
        arrayZahlen ArrayZahlen = new arrayZahlen();
        int[] zahl1 = new int [] {5,0,0,0,0,0,0,0,0};
        int[] zahl2 = new int [] {8,7,0,0,0,0,0,0,0};
        int[] expected = {-3,7,0,0,0,0,0,0,0};
        assertEquals(Arrays.toString(expected),Arrays.toString(ArrayZahlen.sub(zahl1,zahl2)));
    }

    @Test
    void mul() {
        arrayZahlen ArrayZahlen = new arrayZahlen();
        int[] array  = new int [] {4,0,0,0,0,0,0,0};
        int digit = 4;
        int[] expected = {1,6,0,0,0,0,0,0,0};
        assertEquals(Arrays.toString(expected),Arrays.toString(ArrayZahlen.mul(array,digit)));
    }

    @Test
    void div() {
        arrayZahlen ArrayZahlen = new arrayZahlen();
        int[] array  = new int [] {4,0,0,0,0,0,0,0};
        int digit = 4;
        int[] expected = {1,0,0,0,0,0,0,0};
        assertEquals(Arrays.toString(expected),Arrays.toString(ArrayZahlen.div(array,digit)));
    }
}