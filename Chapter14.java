public class Chapter14 {

     public static void main(String []args){
         
         int lastMaxTries = 0;
         int lastMaxsNum = 0;
         
        for (int i = 100000; i<175000; i++) {
            
            if ((i&1)!=1) {
                continue;
            } else {
                System.out.println(i);
            }
            
            int tries = 0;
            int lastNum = i;
            while (lastNum!=1) {
                if ((lastNum&1)==1) {
                    lastNum = 3*lastNum+1;
                    
                } else {
                    lastNum /= 2;
                }
                tries++;
            }
            
            if (tries>lastMaxTries) {
                lastMaxTries = tries;
                lastMaxsNum = i;
            }
            
        }
        
        System.out.println("Tries: " + lastMaxTries + ", Num: " + lastMaxsNum);
     }
}
