public class Klausurpunkte {

    public static int[][] studentenPunkte = new int[42][8];

    public static void main(String[] args) {
        setPunkte(21, 0, 6);
        System.out.println(getPunkte(21, 0));           // Ausgabe: 6
        setPunkte(21, 1, 3);
        setPunkte(21, 2, 5);
        setPunkte(21, 3, 7);
        setPunkte(21, 4, 11);
        setPunkte(21, 5, 2);
        setPunkte(21, 6, 0);
        setPunkte(21, 7, 5);
        System.out.println(gesamtPunktezahl(21));       // Ausgabe: 39
        setPunkte(12, 4, 5);
        setPunkte(34, 4, 5);
        System.out.println(durchschnittsPunktezahl(4)); // Ausgabe: 0.5
    }

    /**
     * Gibt die Punktezahl einer bestimmten Aufgabe für einen bestimmten
     * Studenten zurück.
     *
     * @param student Spezifiziert die Nummer des Studenten dessen Punktezahl
     * zurückgegeben werden soll.
     * @param aufgabe Spezifiziert die Nummer der Aufgabe deren Punktezahl
     * zurückgegeben werden soll.
     *
     * @return Die von Student student bei Aufgabe aufgabe erreichten Punkte.
     */
    public static int getPunkte(int student, int aufgabe) {
        return studentenPunkte[student][aufgabe];
    }

    /**
     * Setzt die Punktezahl einer bestimmten Aufgabe für einen bestimmten
     * Studenten auf einen bestimmten Wert.
     *
     * @param student Spezifiziert die Nummer des Studenten dessen Punktezahl
     * gesetzt werden soll.
     * @param aufgabe Spezifiziert die Nummer der Aufgabe deren Punktezahl
     * gesetzt werden soll.
     * @param punkte Spezifiziert die Anzahl der erreichten Punkte.
     */
    public static void setPunkte(int student, int aufgabe, int punkte) {
        studentenPunkte[student][aufgabe] = punkte;
    }

    /**
     * Berechnet die Summe von Übungspunkten von Student student.
     *
     * @param student Spezifiziert die Nummer des Studenten dessen
     * Gesamtpunktezahl zurückgegeben werden soll.
     * @return Die Summe aller Übungspunkte von Student student.
     */
    public static int gesamtPunktezahl(int student) {
        int out = 0;
        for(int i = 0; i < studentenPunkte[student].length; i++){
            out += studentenPunkte[student][i];
        }
        return out;
    }

    /**
     * Berechnet die Anzahl der Punkte die im Schnitt von allen Studenten bei
     * der spezifizierten Aufgabe aufgabe erreicht wurden.
     *
     * @param aufgabe Spezifiziert die Aufgabe deren durchschnittlich erreichte
     * Punktezahl zurückgegeben werden soll.
     * @return Die im Durchschnitt erreichte Punktezahl bei Aufgabe aufgabe.
     */
    public static double durchschnittsPunktezahl(int aufgabe) {
        int sum = 0;
        for(int i = 0; i < studentenPunkte.length; i++){
            sum += studentenPunkte[i][aufgabe];
        }
        return ((double)sum) / studentenPunkte.length;
    }
}
