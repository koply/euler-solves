public class Chapter4 {

     public static void main(String []args){
        int num = 0;
        int a=0,b=0;
        
        for (int i = 999; i>100; i--) {
            for (int j = 999; j>800; j--) {
                if ((i*j+"").equals(new StringBuilder(String.valueOf(i*j)).reverse().toString())) {
                    if (num < i*j) {
                        num = i*j;
                        a=i;
                        b=j;
                    }
                }
            }
        }
        System.out.println(num + " -> " + a + " * " + b);
     }
}