public class Iteration {

    // Implementieren Sie hier die Methode exp(x,n)
    public static double exp(double base, int exp) {
    	double out = 1;
    	for (int i = 0; i < exp; i++) {
    		out = out * base;
    	}
    	return out;
    }

    // Implementieren Sie hier die Methode fakultaet(n)
    public static int fakultaet(int n) {
		int out = 1;
    	for (int i = 0; i < n; i++) {
    		out = out * (i+1);
    	}
        return out;
    }

    // Implementieren Sie hier die Methode istPrim(n)
    public static boolean istPrim(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Implementieren Sie hier die Methode ggt(m,n)
    public static int ggt(int n, int m){
        if (n==0){
            return m;
        } else {
            while (m != 0) {
                if ( n > m ){
                    n = n - m;
                }
                else {
                    m = m - n;
                }
            }
            return n;
        }

    }

    // Implementieren Sie hier die Methode rebase(n,p)
    public static String rebase(int n, int p) {
        String out = "";

        while (n != 0) {
            out = digit(n % p) + out;
            n = (n - (n % p)) / p;
        }
        return out;
    }

    public static String digit(int d){
        switch (d) {
            case 10: return "A";
            case 11: return "B";
            case 12: return "C";
            case 13: return "D";
            case 14: return "E";
            case 15: return "F";
        }
        return String.valueOf(d);
    }
}
