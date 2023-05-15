import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * In dieser Aufgabe erhalten Sie eine Liste von n Ganzzahlen a0, a1, . . . , an−1 via Standard-In und
 sollen die Häufigkeit aller Ganzzahlen im Intervall [min(a0, a1, . . . , an−1), max(a0, a1, . . . , an−1)]
 bezüglich dieser Liste bestimmen.
 */
public class AufgabeB5A1 {
    public int[] data;

    /**
     * Die Methode public static void main(String[] args) enthält wie immer das ausführbare Programm Ihrer Implementierung. Sie sollen hier die Zahlen aus der Eingabe
     * lesen, eine Instanz der Klasse anlegen und die Häufigkeit der entsprechenden Ganzzahlen bestimmen. Diese sollen dann entsprechend der Beispiele ausgegeben werden.
     * Dazu dürfen Sie Arrays.toString() aus der Bibliothek java.util.Arrays verwenden. Ihr Programm sollte nur O(n) Rechenschritte benötigen.
     * @param args
     */
    public static void main(String[] args) {
        //TODO: A1.main()
        int[] array_input;
        try {
            array_input = readInput();
        }catch(NumberFormatException e){
            System.out.println("Error: Encountered problem parsing argument, required: number");
            return;
        }
        AufgabeB5A1 task = new AufgabeB5A1(array_input);
        int[] counted = task.count();
        System.out.println(Arrays.toString(counted));
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
     * Der Konstruktor public AufgabeB5A1(int[] data) soll eine neue Instanz dieser Klasse erstellen und sich das übergebene data in einem Attribut mit dem selben Namen speichern.
     * @param data
     */
    public AufgabeB5A1(int[] data) {
        //TODO: A1.AufgabeB5A1(int[] data)
        this.data = data;
    }

    /**
     * Die Methode public int getMin() soll das Minimum von this.data zurückgeben.
     * @return
     */
    public int getMin() {
        //TODO: A1.getMin()
        if(data.length == 0){
            return -1;
        }
        int min = data[0];
        for(int i = 1; i < data.length; i++){
            if(data[i] < min){
                min = data[i];
            }
        }
        return min;
    }

    /**
     * Die Methode public int getMax() soll das Maximum von this.data zurückgeben.
     * @return
     */
    public int getMax() {
        //TODO: A1.getMax()
        if(data.length == 0){
            return -1;
        }
        int max = data[0];
        for(int i = 1; i < data.length; i++){
            if(data[i] > max){
                max = data[i];
            }
        }
        return max;
    }

    /**
     * Die Methode public int[] count() soll ein Array C der Länge this.getMax() −
     * this.getMin() + 1 zurückgeben, sodass C[i] die Häufigkeit von i + this.getMin() in
     * der Liste this.data enthält.
     * @return
     */
    public int[] count() {
        //TODO: A1.count()
        int max = getMax();
        int min = getMin();
        int[] out = new int[max - min + 1];
        for(int i = 0; i < data.length; i++){
            int value = data[i];
            out[value - min]++;
        }
        return out;
    }
}
