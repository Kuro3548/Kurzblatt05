/**
 * In dieser Aufgabe erhalten Sie erneut eine Liste von n Ganzzahlen a0, a1, . . . , an−1 via StandardIn und sollen diese in aufsteigender Reihenfolge sortieren. Dazu sollen Sie den Algorithmus
 * Counting-Sort, der in der Vorlesung behandelt wurde, implementieren. Die Schlüsselmenge
 * entspricht den Ganzzahlen aus dem Intervall [min(a0, a1, . . . , an−1), max(a0, a1, . . . , an−1)]. Den
 * Pseudocode finden Sie im Skript.
 */
public class AufgabeB5A2 {

    public int[] data;

    /**
     * Die Methode public static void main(String[] args) enthält wie immer das ausführbare Programm Ihrer Implementierung. Sie sollen hier die Zahlen aus der Eingabe
     * lesen, eine Instanz der Klasse anlegen und die Liste der Ganzzahlen absteigend sortieren.
     * Die sortierte Liste soll samt den Frequenzarray entsprechend der Beispiele ausgegeben
     * werden. Dazu dürfen Sie Arrays.toString() aus der Bibliothek java.util.Arrays verwenden. Ihr Programm sollte nur O(n + max(a0, a1, . . . , an−1) − min(a0, a1, . . . , an−1))
     * Rechenschritte benötigen.
     * @param args
     */
    public static void main(String[] args) {
        //TODO: A2.main()
    }

    /**
     * Die Methode public static int[] readInput() soll wie in Kurzaufgabe 5.1 alle Ganzzahlen aus Standard-In einlesen.
     * @return
     * @throws NumberFormatException
     */
    public static int[] readInput() throws NumberFormatException {
        //TODO: A2.readInput()
        return null;
    }

    /**
     * Der Konstruktor public AufgabeB5A2(int[] data) soll eine neue Instanz dieser Klasse erstellen und sich das übergebene data in einem Attribut mit dem selben Namen
     * speichern.
     * @param data
     */
    public AufgabeB5A2(int[] data) {
        //TODO: A2.AufgabeB5A2(int[] data)
    }

    /**
     * Die Methode public int[] countingSort() soll den Algurithmus Counting-Sort implementieren. Zum Zählen der Frequenzen dürfen Sie Ihr Ergebnis aus Kuraufgabe 5.1
     * verwenden (weitere Hilfsarrays sind nicht erlaubt). Überschreiben Sie this.data mit der
     * absteigend sortierten Liste von Ganzzahlen, und geben Sie als Rückgabewert das Frequenzarray zurück. Beachten Sie dabei, dass der Algorithmus aus dem Skript angepasst
     * werden muss, um auf Hilfsarrays zu verzichten.
     * @return
     */
    public int[] countingSort() {
        //TODO: A2.countingSort()
        return null;
    }
}
