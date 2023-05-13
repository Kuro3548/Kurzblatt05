/**
 * Auf Blatt 4 haben Sie sich bereits ausgiebig mit dem Auswahlproblem befasst. Dabei haben Sie
 * Duplikate einfach ignoriert. Zum Beispiel sind sie auf Blatt 4 davon ausgegangen, dass 3 das 4-
 * kleinste Element von [1, 2, 3, 3, 3, 5, 5, 7] ist. In dieser Aufgabe erhalten Sie erneut eine Liste von
 * n Ganzzahlen a0, a1, . . . , an−1 via Standard-In und sollen das k-kleinste Element in einem Array
 * bestimmen, wobei Duplikate beachtet werden: Das 4-kleinste Element von [1, 2, 3, 3, 3, 5, 5, 7]
 * ist dann 5. Allgemein ausgedrückt ist a das k-kleinste Element des Arrays, wenn es im Array
 * genau k − 1 unterschiedliche Elemente gibt, die kleiner als a sind.
 */
public class AufgabeB5A3 {
    public int[] data;

    /**
     * Die Methode public static void main(String[] args) enthält wie immer das ausführbare Programm Ihrer Implementierung. Um das k-kleinste Element zu bestimmen,
     * sollen Sie die Liste aus der Eingabe einlesen, eine Zahl als Argument erhalten und die
     * Instanz-Methode aufrufen. Das k-kleinste Element soll entsprechend der Beispiele ausgegeben werden. Ihr Programm sollte nur O(n+max(a0, a1, . . . , an−1)−min(a0, a1, . . . , an−1))
     * Rechenschritte benötigen. Wie immer sollten Sie bei ungültigen Eingaben passende Fehlermeldungen ausgeben.
     * @param args
     */
    public static void main(String[] args) {
        //TODO: A3.main()
    }

    /**
     * Die Methode public static int[] readInput() soll wie in Kurzaufgabe 5.1 und 5.2
     * alle Ganzzahlen aus Standard-In einlesen.
     * @return
     * @throws NumberFormatException
     */
    public static int[] readInput() throws NumberFormatException {
        //TODO: A3.readInput()
        return null;
    }

    /**
     * Der Konstruktor public AufgabeB5A3(int[] data) soll eine neue Instanz dieser Klasse erstellen und sich das übergebene data in einem Attribut mit dem selben Namen
     * speichern.
     * @param data
     */
    public AufgabeB5A3(int[] data) {
        //TODO: A3.AufgabeB5A3(int[] data)
    }

    /**
     * Die Methode public int exactSelect(int k) soll das k-kleinste Element des Arrays
     * zurückgeben. Verwenden Sie dabei den Mechanismus von Counting-Sort, ohne dass Sie
     * this.data tatsächlich sortieren. Um das Ergebnis zu ermitteln, müssen Sie nicht wirklich wissen, wie oft jeder Wert vorkommt. Tatsächlich reicht es, wenn Sie sich für jeden
     * möglichen Wert speichern, ob dieser überhaupt in der Eingabe vorkommt. Bei Ihrem
     * Hilfsarray sollte es sich daher nicht um ein int-Array, sondern um ein boolean-Array
     * handeln (dieses benötigt deutlich weniger Platz).
     * @param k
     * @return
     */
    public int exactSelect(int k) {
        //TODO: A3.exactSelect(int k)
        return -1;
    }

}
