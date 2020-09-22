public class Chapter10 {

     public static void main(String []args){
        long last = 0;
        for (int p : listPrimes(1999999)) last += p;
        System.out.println(last);
    }
     
     
    public static int sqrt(int x) {
        int y = 0;
        for (int i = 1 << 15; i != 0; i >>>= 1) {
            y |= i;
            if (y > 46340 || y * y > x) y ^= i;
        }
        return y;
    }
     
    public static boolean[] listPrimality(int n) {
        boolean[] result = new boolean[n + 1];
        if (n >= 2) result[2] = true;
        for (int i = 3; i <= n; i += 2) result[i] = true;
        for (int i = 3, end = sqrt(n); i <= end; i += 2) {
            if (result[i]) for (int j = i * i, inc = i * 2; j <= n; j += inc) result[j] = false;
        }
        return result;
    }
    public static int[] listPrimes(int n) {
        boolean[] isPrime = listPrimality(n);
        int count = 0;
        for (boolean b : isPrime) {
            if (b) count++;
        }
        int[] result = new int[count];
        for (int i = 0, j = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }
}