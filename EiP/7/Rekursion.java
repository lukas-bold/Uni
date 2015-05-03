public class Rekursion {

    // Implementieren Sie hier die Methode exp(x,n)
    public static double exp(double base, int exp) {
    	if (exp == 0) {
    		return 1;
    	}
    	else {
    		return base*exp(base, exp -1);
    	}
    }

    // Implementieren Sie hier die Methode fakultaet(n)
    public static int fakultaet(int n) {
    	if (n == 1) {
    		return 1;
    	}
    	else {
    		return n*fakultaet(n-1);    		
    	}
    }

    // Implementieren Sie hier die Methode istPrim(n)
    public static boolean istPrim(int n) {
    	return PrimHelper(n, n-1);
    }

    public static boolean PrimHelper(int n, int q) {
    	if (q==1){
    		return true;
    	}
    	if (n%q == 0) {
    		return false;
    	}
    	return PrimHelper(n, q-1);
    }

    // Implementieren Sie hier die Methode ggt(m,n)
    public static int ggt(int n, int m){
    	if (m==n) {
    		return m;
    	}
    	if (m>n) {
    		return ggt(m-n,n);
    	}
    	if (m<n) {
    		return ggt(m, n-m);
    	}
    }

    // Implementieren Sie hier die Methode rebase(n,p)
    public static String rebase(int n, int p) {
        if (n=>p){
            return rebase(n/p , p) + digit(n%p);
        }
        return digit(n);

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
