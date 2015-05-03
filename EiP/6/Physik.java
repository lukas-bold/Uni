/**
  * Ein Modul, dass Operationen f&uuml;r physikalische
  * Berechnungen zur Verf&uuml;gung stellt.
  */

public class Physik {

     /**
       * Berechnung der Strecke, die ein K&ouml;rper mit einer gegeben Masse,
       * der ein gegebene Zeit lang mit einer auf ihn einwirkenden
       * konstanten Kraft bewegt wird, zur&uuml;cklegt.
       * @param   m die Masse
       * @param   t die Zeit
       * @param   k die Kraft
       * @return  die Strecke, die der K&ouml;rper zur&uuml;cklegt.
       */
     public static double strecke(double m, double t, double k) {
         return ( k * Math.pow(t,2)) / (2 * m);
     }

     /**
       * Berechnung der Arbeit, die ein K&ouml;rper mit einer gegeben Masse,
       * der ein gegebene Zeit lang mit einer auf ihn einwirkenden
       * konstanten Kraft bewegt wird, leistet.
       * @param   m die Masse
       * @param   t die Zeit
       * @param   k die Kraft
       * @return  die Arbeit, die der K&ouml;rper leistet.
       */
     public static double arbeit(double m, double t, double k) {
         return k * strecke(m,t,k);
     }

     /**
     * Umwandlung von Fahrenheit in Celsius
     *
     * @param Temperatur in Fahrenheit
     * @return äquivalenter Wert in Celsius
     *
     */
    public static double celsius(double a) {
      return (a - 32)*5/9;
    }
     
    /**
      * Berechnung der Spannarbeit, die bei einer Feder der Federhärte d
      * über eine Strecke s geleistet werden muss
      * @param  d Federhärte
      * @param  s Strecke
      * @return zu leistende Arbeit
      */
    public static double spannarbeit(double d, double s) {
      return 0.5*d*s*s;
    }

     /**
      * Nur zu Testzwecken.
      */
     public static void main(String[] args) {
         System.out.println("Strecke(1,2,3) = "+strecke(1.0, 2.0, 3.0));
         System.out.println("Arbeit(1,2,3) = "+arbeit(1.0, 2.0, 3.0));

     }

}
