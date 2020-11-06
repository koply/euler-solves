 import java.math.BigInteger;
 
 public class Chapter15 {
    public static void main(String args[]) {
        BigInteger sa = new BigInteger("1");
        for (int i = 40; i>20; i--) {
            sa = sa.multiply(new BigInteger(i+""));
        }
//         BigInteger sa1 = new BigInteger("0");
        for (int i = 20; i>0; i--) {
                sa = sa.divide(new BigInteger(i+""));
        }
        
        System.out.println(sa.toString());
    }
 } 
