/**
 * In dieser Aufgabe erhalten Sie eine Liste von n Ganzzahlen a0, a1, . . . , an−1 via Standard-In und
 sollen die Häufigkeit aller Ganzzahlen im Intervall [min(a0, a1, . . . , an−1), max(a0, a1, . . . , an−1)]
 bezüglich dieser Liste bestimmen.
 */
public class AufgabeB5A1 {
    public int[] data;
    /**
     * Die Methode public static void main(String[] args) enthält wie immer das ausführbare Programm Ihrer Implementierung. Sie sollen hier die Zahlen aus der Eingabe
     * lesen, eine Instanz der Klasse anlegen und die Häufigkeit der entsprechenden Ganzzahlen bestimmen. Diese sollen dann entsprechend der Beispiele ausgegeben werden. Dazu
     * dürfen Sie Arrays.toString() aus der Bibliothek java.util.Arrays verwenden. Ihr
     * Programm sollte nur O(n) Rechenschritte benötigen.
     * @param args
     */
    public static void main(String[] args) {
        //TODO: A1.main()
    }

    /**
     * Die Methode public static int[] readInput() soll alle Ganzzahlen aus Standard-In
     * einlesen. Wie in den vorigen Wochen sollen nur Eingaben akzeptiert werden, die vollständig aus Ganzzahlen bestehen.
     * Die eingelesenen Ganzzahlen sollen als int[] zurückgegeben werden. Entstehende NumberFormatException sollen von dieser Methode weitergeleitet werden.
     * @return
     * @throws NumberFormatException
     */
    public static int[] readInput() throws NumberFormatException {
        //TODO: A1.readInput()
        return null;
    }

    /**
     * Der Konstruktor public AufgabeB5A1(int[] data) soll eine neue Instanz dieser Klasse erstellen und sich das übergebene data in einem Attribut mit dem selben Namen speichern.
     * @param data
     */
    public AufgabeB5A1(int[] data) {
        //TODO: A1.AufgabeB5A1(int[] data)
    }

    /**
     * Die Methode public int getMin() soll das Minimum von this.data zurückgeben.
     * @return
     */
    public int getMin() {
        //TODO: A1.getMin()
        return -1;
    }

    /**
     * Die Methode public int getMax() soll das Maximum von this.data zurückgeben.
     * @return
     */
    public int getMax() {
        //TODO: A1.getMax()
        return -1;
    }

    /**
     * Die Methode public int[] count() soll ein Array C der Länge this.getMax() −
     * this.getMin() + 1 zurückgeben, sodass C[i] die Häufigkeit von i + this.getMin() in
     * der Liste this.data enthält.
     * @return
     */
    public int[] count() {
        //TODO: A1.count()
        return null;
    }
}
