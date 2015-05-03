public class Algorithmen {

    public static boolean istQuadratzahl(int zahl) {
        return 
    }

    public static int[] fib(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            if (i==1 || i==2) {
                arr[i] = 1;
            }
            else if (i==0)  {
                arr[i] = 0;
            } 
            else {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        return arr;
}

    public static int[] countElements(int[] werte, int max, int numBuckets) {
        int arr[] = new int[numBuckets];
        int invLength = (max/numBuckets);

        for (int i = 0; i < numBuckets; i++ ) {

            for (int j = 0; j < werte.length; j++ ) {
                if (werte[j] < invLength*(i+1) && werte[j] >= invLength*i){
                    arr[i]++;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("istQuadratzahl(1337): " + istQuadratzahl(1337)); // false

        System.out.print("fib(6): { ");
        int[] fibonacci = fib(6);
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println("}"); // { 0 1 1 2 3 5 }

        System.out.print("countElements({0,9,2,3,4,5,7,8,1}, 10, 2): { ");
        int[] werte = {0, 9, 2, 3, 4, 5, 7, 8, 1};
        int max = 10;
        int numBuckets = 2;
        int[] counted = countElements(werte, max, numBuckets);
        for (int i = 0; i < counted.length; i++) {
            System.out.print(counted[i] + " ");
        }
        System.out.println("}"); // { 5 4 }
    }

}
