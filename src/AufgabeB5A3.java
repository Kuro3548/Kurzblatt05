import java.util.ArrayList;
import java.util.Scanner;

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
     * sollen Sie die Liste aus der Eingabe einlesen, eine Zahl als Argument erhalten und die Instanz-Methode aufrufen.
     * Das k-kleinste Element soll entsprechend der Beispiele ausgegeben werden. Ihr Programm sollte nur O(n+max(a0, a1, . . . , an−1)−min(a0, a1, . . . , an−1))
     * Rechenschritte benötigen. Wie immer sollten Sie bei ungültigen Eingaben passende Fehlermeldungen ausgeben.
     * @Runtime: O(n) - n ist die Anzahl an Zeilen in Standard-In
     * @param args Die Argumente der Kommando-Zeile
     */
    public static void main(String[] args) {
        //TODO: A3.main() --Drafted--
        int[] array_input;
        int k;
        try {
            array_input = readInput();
            k = Integer.parseInt(args[0]);
        }catch(NumberFormatException e){
            System.out.println("Error: Encountered problem parsing commandline-argument, required: number");
            return;
        }
        AufgabeB5A3 task = new AufgabeB5A3(array_input);
        System.out.println(task.exactSelect(k));
    }

    /**
     * Die Methode public static int[] readInput() soll wie in Kurzaufgabe 5.1 und 5.2
     * alle Ganzzahlen aus Standard-In einlesen.
     * @Runtime: O(n) - n ist die Anzahl an Zeilen in Standard-In
     * @return Array mit Inhalt von der Standard-Eingabe
     * @throws NumberFormatException Wenn ein Wert in der Eingabe keine Zahl ist
     */
    public static int[] readInput() throws NumberFormatException {
        //TODO: A3.readInput() --Drafted--
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
     * Der Konstruktor public AufgabeB5A3(int[] data) soll eine neue Instanz dieser Klasse erstellen und sich das übergebene data in einem Attribut mit dem selben Namen
     * speichern.
     * @Runtime: O(1)
     * @param data Das Array, welches in dem Attribut für die Methoden der Klasse eingespeichert wird
     */
    public AufgabeB5A3(int[] data) {
        //TODO: A3.AufgabeB5A3(int[] data) --Drafted--
        this.data = data;
    }

    /**
     * Die Methode public int exactSelect(int k) soll das k-kleinste Element des Arrays zurückgeben.
     * Verwenden Sie dabei den Mechanismus von Counting-Sort, ohne dass Sie this.data tatsächlich sortieren.
     * Um das Ergebnis zu ermitteln, müssen Sie nicht wirklich wissen, wie oft jeder Wert vorkommt.
     * Tatsächlich reicht es, wenn Sie sich für jeden möglichen Wert speichern, ob dieser überhaupt in der Eingabe vorkommt.
     * Bei Ihrem Hilfsarray sollte es sich daher nicht um ein int-Array, sondern um ein boolean-Array
     * handeln (dieses benötigt deutlich weniger Platz).
     * @Runtime: O(n) - n ist die Größe des Arrays im Attribut data
     * @param k Die Stelle, das wie-viel kleinste Element ausgegeben werden soll
     * @return Das k-kleinste Element im Array, wirft eine IllegalArgumentException, wenn k außerhalb des Bereichs ist
     */
    public int exactSelect(int k) {
        //TODO: A3.exactSelect(int k)
        if(k < 1 || k - 1 >= data.length){
            throw new IllegalArgumentException("Tried selecting out of bounds:" + k + " in array of length " + data.length);
        }
        AufgabeB5A1 task1 = new AufgabeB5A1(data);
        int max = task1.getMax();
        int min = task1.getMin();
        boolean[] passed = new boolean[max - min + 1];
        for(int i = 0; i < data.length; i++){
            int value = data[i];
            passed[value - min] = true;
        }
        //Go through array and count number of passed 'true'. If we passed k 'true'-statements, return value of key i
        int counter = 0;
        for(int i = 0; i < passed.length; i++){
            if(passed[i] == true){
                counter++;
                if(counter == k){
                    return i + min;
                }
            }
        }
        //Should never be reached
        return -1;
    }

}
