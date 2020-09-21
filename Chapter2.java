public class Chapter2 {

     public static void main(String []args){
        //1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
        int a = 1;
        int b = 2;
        int total = 2; // hardcoded b
        while (true) {
            int entry = a+b;
            if (entry > 4000000) {
                break;
            } else if (entry < 145) {
                System.out.println("A -> " + a + " : B -> " + b);
            }
            if (entry % 2 == 0) {
                total += entry;
            }
            a=b;
            b=entry;
            
        }
        System.out.println(total);
     }
}