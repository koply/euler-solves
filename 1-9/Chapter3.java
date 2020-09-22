public class Chapter3 {

     public static void main(String []args){
        long n = 600851475143L;
        int i = 2;
        while (i*i < n) {
            while (n % i == 0) {
                n = n/i;
            }
            i=i+1;
        }
        System.out.println(n);
     }
}