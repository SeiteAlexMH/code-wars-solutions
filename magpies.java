public class Dinglemouse {

  public static boolean child(final String bird1, final String bird2) {
    boolean isChild = false;
    int differences = 0;
    for(int i =0; i<bird1.length();i++){
      if(bird1.charAt(i) != bird2.charAt(i)) { 
        differences ++;
      }
    }
    
    if (differences>0 && differences<3){
      isChild = true;
    }
      
    return isChild;
  }
  
  public static boolean grandchild(final String bird1, final String bird2) {
    boolean isGrandChild = false;
    int differences = 0;
    for(int i =0; i<bird1.length();i++){
      if(bird1.charAt(i) != bird2.charAt(i)) { 
        differences ++;
      }
    }
    
    if (differences>=0 && differences<5){
      isGrandChild = true;
    }
    
    if (differences==1 && bird1.length()==1){
      isGrandChild = false;
    }
    
    return isGrandChild;
  }

}
