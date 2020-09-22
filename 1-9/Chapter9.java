public class Chapter9 {

     public static void main(String []args){
        for (int i = 1; i<50; i++) {
            for (int j = 0; j<i; j++) {
                if (2*(i*i)+2*i*j==1000) {
                    long s = ((i*i)-(j*j))*(2*i*j)*((i*i)+(j*j));
                    System.out.println(s);
                }
            }
        }
     }
}