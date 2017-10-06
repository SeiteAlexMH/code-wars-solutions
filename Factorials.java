import java.math.BigInteger;
public class Kata
{

  public static String Factorial(int n) {
    if(n<0){
     return "";
    } else {
      BigInteger answer = new BigInteger("1");
      for(int i=1; i<n+1;i++){
        answer= answer.multiply(new BigInteger(Integer.toString(i)));
      }
      return answer.toString();
    }
  }

}
