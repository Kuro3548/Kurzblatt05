import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * In dieser Aufgabe erhalten Sie erneut eine Liste von n Ganzzahlen a0, a1, . . . , an−1 via StandardIn und sollen diese in aufsteigender Reihenfolge sortieren.
 * Dazu sollen Sie den Algorithmus Counting-Sort, der in der Vorlesung behandelt wurde, implementieren.
 * Die Schlüsselmenge entspricht den Ganzzahlen aus dem Intervall [min(a0, a1, . . . , an−1), max(a0, a1, . . . , an−1)]. Den Pseudocode finden Sie im Skript.
 */
public class AufgabeB5A2 {

    public int[] data;

    /**
     * Die Methode public static void main(String[] args) enthält wie immer das ausführbare Programm Ihrer Implementierung.
     * Sie sollen hier die Zahlen aus der Eingabe lesen, eine Instanz der Klasse anlegen und die Liste der Ganzzahlen absteigend sortieren.
     * Die sortierte Liste soll samt den Frequenzarray entsprechend der Beispiele ausgegeben werden.
     * Dazu dürfen Sie Arrays.toString() aus der Bibliothek java.util.Arrays verwenden.
     * Ihr Programm sollte nur O(n + max(a0, a1, . . . , an−1) − min(a0, a1, . . . , an−1)) Rechenschritte benötigen.
     * @Runtime: O(n) - n ist die Anzahl an Zeilen in Standard-In
     * @param args Die Argumente der Kommando-Zeile
     */
    public static void main(String[] args) {
        //TODO: A2.main()
        int[] array_input;
        try {
            array_input = readInput();
        }catch(NumberFormatException e){
            System.out.println("Error: Encountered problem parsing argument, required: number");
            return;
        }
        AufgabeB5A2 task = new AufgabeB5A2(array_input);
        System.out.println("Before sorting: " + Arrays.toString(task.data));
        int[] frequency = task.countingSort();
        System.out.println("Frequencies: "+ Arrays.toString(frequency));
        System.out.println("After Sorting: "+ Arrays.toString(task.data));
    }

    /**
     * Die Methode public static int[] readInput() soll wie in Kurzaufgabe 5.1 alle Ganzzahlen aus Standard-In einlesen.
     * @Runtime: O(n) - n ist die Anzahl an Zeilen in Standard-In
     * @return Array mit Inhalt von der Standard-Eingabe
     * @throws NumberFormatException Wenn ein Wert in der Eingabe keine Zahl ist
     */
    public static int[] readInput() throws NumberFormatException {
        //TODO: A2.readInput()
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        try {
            while (in.hasNextLine()) {
                int current = Integer.parseInt(in.nextLine());
                list.add(current);
            }
        }catch(NumberFormatException e){
            System.err.println("Error: Encountered problem parsing the input.");
            throw e;
        }
        int[] arr = new int[list.size()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }

    /**
     * Der Konstruktor public AufgabeB5A2(int[] data) soll eine neue Instanz dieser Klasse erstellen und sich das übergebene data in einem Attribut mit dem selben Namen
     * speichern.
     * @Runtime: O(1)
     * @param data Das Array, welches in dem Attribut für die Methoden der Klasse eingespeichert wird
     */
    public AufgabeB5A2(int[] data) {
        //TODO: A2.AufgabeB5A2(int[] data)
        this.data = data;
    }

    /**
     * Die Methode public int[] countingSort() soll den Algorithmus Counting-Sort implementieren. Zum Zählen der Frequenzen dürfen Sie Ihr Ergebnis aus Kuraufgabe 5.1
     * verwenden (weitere Hilfsarrays sind nicht erlaubt). Überschreiben Sie this.data mit der absteigend sortierten Liste von Ganzzahlen und geben Sie als Rückgabewert das Frequenzarray zurück.
     * Beachten Sie dabei, dass der Algorithmus aus dem Skript angepasst werden muss, um auf Hilfsarrays zu verzichten.
     * @Runtime: O(n) - n ist die Größe des Arrays im Attribut data
     * @return Die Häufigkeit der Zahlen des Arrays, erstes Element des Arrays ist Anzahl des Minimums etc.
     */
    public int[] countingSort() {
        //TODO: A2.countingSort()
        AufgabeB5A1 task1 = new AufgabeB5A1(data);
        int min = task1.getMin();
        int[] counted = task1.count();
        int j = 0; //j = Index für data-Array
        for(int i = counted.length - 1; i >= 0; i--){
            //den Anfangswert für die Ausgabe merken
            int temp = counted[i];
            //Solange es noch Duplikate gibt
            while(counted[i] > 0){
                data[j] = i + min;
                counted[i]--;
                j++;
            }
            counted[i] = temp;
        }
        return counted;
    }
}
