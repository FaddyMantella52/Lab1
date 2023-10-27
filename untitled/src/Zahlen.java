public class Zahlen {
    public int maxZahl(int[] zahlen) {
        if(zahlen.length == 0){
            throw new IllegalArgumentException("Array length 0");}
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] > max){
                max = zahlen[i];
            }
        }
    return max;
    }

    public int minZahl(int[] zahlen) {
        if(zahlen.length == 0){
            throw new IllegalArgumentException("Array length 0");}
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < zahlen.length; i++){
            if (zahlen[i] < min) {
                min = zahlen[i];
            }
        }
    return min;
    }

    public int maxSumme(int[] zahlen) {
        if(zahlen.length == 0){
            throw new IllegalArgumentException("Array length 0");}
        int totalSum = 0;
        int minZahl = Integer.MAX_VALUE;
        for (int i = 0; i<zahlen.length; i++){
            totalSum += zahlen[i];
            if (zahlen[i] < minZahl){
                minZahl = zahlen[i];
            }
        }

    return totalSum - minZahl;
    }

    public int minSumme(int[] zahlen) {
        if(zahlen.length == 0){
            throw new IllegalArgumentException("Array length 0");}
        int totalSum = 0;
        int maxZahl = Integer.MIN_VALUE;
        for (int i = 0; i<zahlen.length; i++){
            totalSum += zahlen[i];
            if (zahlen[i] > maxZahl){
                maxZahl = zahlen[i];
            }
        }
        return totalSum - maxZahl;
    }
}