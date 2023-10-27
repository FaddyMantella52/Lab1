public class NotenProzessor {

    public int[] nichtAusreichend(int[] note) throws Exception {
        if(note.length == 0){
            throw new IllegalArgumentException("Array length 0");
        }
        int size = 0;
        for(int i = 0; i < note.length; i++) {
            if (note[i] < 38){
                size += 1;
            }
        }
        int[] result = new int[size];
        int resultIndex = 0;
        for (int i = 0; i < note.length; i++) {
            if (note[i] < 38) {
                result[resultIndex] = note[i];
                resultIndex++;
            }
        }
        return result;
    }
    public int[] abrundungNoten(int[] note) {
        if (note.length == 0){
            throw new IllegalArgumentException("Array ist leer");
        }
        for (int i = 0; i < note.length; i++) {

            if (note[i] < 0 || note[i] > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return null;
            }
        }

        int[] finaleNoten = new int[0];

        for (int i = 0; i < note.length; i++) {
            if (round(note[i]) >= 40) {
                finaleNoten = addToArray(finaleNoten, round(note[i]));
            }
        }
        return finaleNoten;
    }

    public int round(int note) {
        if(note > 100){
            throw new IllegalArgumentException("Zahl grosser als 100");
        }
        if (note < 38) {
            return note;
        } else {
            if (note % 5 > 2) {
                return note + 5 - note % 5;
            } else {
                return note;
            }
        }
    }

    public int[] addToArray(int[] original, int newElement) {
        int[] result = new int[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            result[i] = original[i];
        }
        result[original.length] = newElement;
        return result;
    }

    public int maxNote(int[] noten) throws Exception {
        if(noten.length == 0){
            throw new IllegalArgumentException("Array length 0");
        }
        int max = 0;
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] > max) {
                max = round(noten[i]);
            }
        }
        return max;
    }

    public int durschnittenWert(int[] noten) {
        if(noten.length == 0){
            throw new IllegalArgumentException("Array length 0");
        }
        int sum = 0;
        int nrNoten = 0;
        for (int i = 0; i < noten.length; i++) {
            sum += noten[i];
            nrNoten += 1;
        }
        return sum / nrNoten;
    }
}
