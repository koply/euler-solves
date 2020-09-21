public class Chapter6 {

     public static void main(String []args){
        int kare = 0;
        int toplam = 0;
        for (int i = 1; i<101; i++) {
            kare+=i*i;
            toplam+=i;
        }
        System.out.println(toplam*toplam-kare);
     }
}