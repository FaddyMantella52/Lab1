import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Ubung 1:

        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[] { 10, 20, 30, 32, 47, 48, 60, 98 };

        System.out.println("Die Noten nach die Abrundung sind:  " + Arrays.toString(notenProzessor.abrundungNoten(noten)));
        System.out.println("Die maximale Note ist: " + notenProzessor.maxNote(noten));
        System.out.println("Die Durschnittswert ist: " + notenProzessor.durschnittenWert(noten));
        System.out.println("Die nicht ausreichende Noten sind: " + Arrays.toString(notenProzessor.nichtAusreichend(noten)));

        //Ubung 2:

        Zahlen _zahlen = new Zahlen();

        int[] zahlen = new int[] {4, 8, 3, 10, 17};

        System.out.println("The max value from the number list is: " + _zahlen.maxZahl(zahlen));
        System.out.println("The min value from the number list is: " + _zahlen.minZahl(zahlen));
        System.out.println("The max sum from the number list is: " + _zahlen.maxSumme(zahlen));
        System.out.println("The min sum from the number list is: " + _zahlen.minSumme(zahlen));

        //Ubung 3:

        arrayZahlen ArrayZahlen = new arrayZahlen();

        int[] zahl1 = new int [] {5,0,0,0,0,0,0,0,0};
        int[] zahl2 = new int [] {8,7,0,0,0,0,0,0,0};
        int[] array  = new int [] {4,0,0,0,0,0,0,0};

        System.out.println( "The sum of array 1 and array 2 is: " + Arrays.toString(ArrayZahlen.sum(zahl1,zahl2)));
        System.out.println( "The sub of array 1 and array 2 is: " + Arrays.toString(ArrayZahlen.sub(zahl1,zahl2)));
        System.out.println("The mul of the array and the digit is: " + Arrays.toString(ArrayZahlen.mul(array,8)));
        System.out.println("The div of the array and the digit is: " + Arrays.toString(ArrayZahlen.div(array,8)));

        //Ub 4:

        Elektronik_Shop elektronik_shop = new Elektronik_Shop();

        int [] tastatur = new int [] {40,35,70,15,45};
        int [] USB = new int[] {25,40,15,60,80};

        System.out.println("Die billigste Tastatur ist: " +  elektronik_shop.billigste(tastatur) +"€");
        System.out.println("Die teuerste Periferiegerät ist: "+ elektronik_shop.teuerste(tastatur,USB)+"€");
        System.out.println("Die teuerste USB,die Markus kaufen kann ist: " + elektronik_shop.teursteMarkus(USB,50)+"€");

        }
    }
