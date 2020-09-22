public class Chapter7 {

     public static void main(String []args){
        int i = 2;
        int asalLoop = 0;
        while (true) {
            if (check(i)) asalLoop++;
            if (asalLoop==10001) {
                System.out.println(i);
                System.exit(0);
            }
            i++;
        }
        
     }
     
     private static boolean check(int entry){
        int ola = entry / 2, i = 2;
        while (i <= ola){
            if (entry % i == 0){
              return false;
            }
            i++;
        }
        return true;
    }
}