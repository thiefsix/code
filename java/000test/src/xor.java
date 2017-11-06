import java.math.BigInteger;
 
public class xor{
    public static void main (String[] args) {
        String str1="6a3fba70c97c880679a740669ddd5ca3";
        String str2="8FC63BC4337CD4B5F70577118BB69FE8";
        System.out.println(StringXor(str1, str2));
    }
 
    public static String StringXor(String str1, String str2) {
        BigInteger big1= new BigInteger(str1, 16);
        BigInteger big2= new BigInteger(str2, 16);
        return big1.xor(big2).toString(16);
         
    }
}
