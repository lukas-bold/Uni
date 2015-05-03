public class GlobalLokal {

    public static int g1 = 5;
    public static int g2 = 12;
    public static int smallest;
    public static int median;
    public static int biggest;
    
    
    // Implementieren Sie hier die Methode swap()
    public static void swap() {
    	int tmp = g1;
    	g1 = g2;
    	g2 = tmp;
    }
    
    // Implementieren Sie hier die Methode sort(a,b,c)
    public static void sort(int a, int b, int c){
    	int[] input = {a,b,c};

    	biggest = Integer.MIN_VALUE;

    	for (int i = 0; i < input.lenght; i++) {
    		if (input[i] >= biggest){
                smallest = median;
                median = biggest;
    			biggest = input[i];
    		}
    		else if (input[i] >= median) {
    			smallest = median;
    			median = input[i];
    		}
    		else {
    			smallest = input[i];
    		}
    	}

    }

    // Implementieren Sie hier die Methode grade(n)
    public static double grade(int n){
        
        double [] grades = {1,1.3,1.7,2.0,2.3,2.7,3.0,3.3,3.7,4.0,5.0};
        
        for (int i = 0;i < 11; i++) {
            if (n >= 105-5*i) {
                return grades[i];
            }
        }
        
        return 0;
    }
}
