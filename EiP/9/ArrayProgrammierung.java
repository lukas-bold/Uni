public class ArrayProgrammierung {

    public static int summe(int[] arr){
        int res = 0;
        for (int i = 0;i < arr.length ;i++ ) {
            res += arr[i];            
        }
        return res;
    }
    
    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0;i < arr.length;i++ ) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    
    public static int[] palindrom(int[] arr){
        int[] palindrom = new int[arr.length];
        for (int i = arr.length ; i > 0; i-- ) {
            palindrom[arr.length - i] = arr[i-1];
        }
        return palindrom;
    }
    
    public static void main(String[] args) {
        System.out.println("summe(7,4,8,42,13) = " + summe(new int[]{7, 4, 8, 42, 13})); //74
        System.out.println("min(7,4,8,42,13) = " + min(new int[]{7, 4, 8, 42, 13})); // 4
        System.out.print("palindrom(7,4,8,42,13) = ");
        printArray(palindrom(new int[]{7, 4, 8, 42, 13})); // [13,42,8,4,7]
    }

    public static void printArray(int[] a) {
        if (a.length == 0) {
            return;
        }
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
