public class Chapter5 {

     public static void main(String []args){
        int[] numbers = new int[20];
        for (int i = 0; i <20; i++) {
            numbers[i] = i+1;
        }
        int number = 20;
        while (true) {
            for (int c = 0; c < numbers.length; c++) {
                if (number % numbers[c] !=0) {
                    break;
                }
                if (c == 19) {
                    System.out.println(number);
                    System.exit(0);
                }
            }
            number++;
        }
     }
}