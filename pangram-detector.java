public class PangramChecker {
  public boolean check(String sentence){
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    for(int i=0; i<alphabet.length();i++){
      if(sentence.toLowerCase().lastIndexOf(alphabet.charAt(i)) == -1){
        return false;
      }
    }
    
    return true;
  }
}
