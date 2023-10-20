import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NotenProzessorTest {

    @Test
    void abrundungNoten() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = new int[] { 10, 20, 30, 32, 47, 48, 60, 98};
        int[] expected = new int[] {47,50,60,100};
        assertEquals(Arrays.toString(expected),Arrays.toString(notenProzessor.abrundungNoten(noten)));
    }

    @Test
    void round() {
        NotenProzessor notenProzessor = new NotenProzessor();
        assertEquals(25,notenProzessor.round(25));
        assertEquals(50,notenProzessor.round(48));
    }

    @Test
    void maxNote() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = new int[] {35,47,98,95,76};
        assertEquals(100,notenProzessor.maxNote(noten));
    }

    @Test
    void durschnittenWert() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = new int[] {25,50,98,45,32};
        assertEquals(50,notenProzessor.durschnittenWert(noten));
    }

    @Test
    void nichtAusreichend(){
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = new int[] {25,15,38,50,98};
        int[] expected = {25,15};
        assertEquals(Arrays.toString(expected),Arrays.toString(notenProzessor.nichtAusreichend(noten)));
   }

   @Test
    void addToArray(){
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] original = new int[] {25,15,38,50,98};
        int newElement = 67;
        int[] expected = {25,15,38,50,98,67};
        assertEquals(Arrays.toString(expected),Arrays.toString(notenProzessor.addToArray(original,newElement)));
   }
}