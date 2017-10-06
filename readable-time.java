public class HumanReadableTime {
  public static String makeReadable(int input) {
    String answer = "";
    int hours   = 0;
    int minute  = 0;
    int seconds = 0;
    
    while(input>=3600){
      if(hours<99){
        hours++;
      }
      input-=3600;
    }
    
    while(input>=60){
      if(minute<59){
        minute++;
      }
      input-=60;
    }
    
    seconds = input;
    
    if(hours<10){
      answer+="0";
      answer+=Integer.toString(hours);
    } else {
      answer+=Integer.toString(hours);
    }
    
    answer+=":";
    
    if(minute<10){
      answer+="0";
      answer+=Integer.toString(minute);
    } else {
      answer+=Integer.toString(minute);
    }
    
    answer+=":";
    
    if(seconds<10){
      answer+="0";
      answer+=Integer.toString(seconds);
    } else {
      answer+=Integer.toString(seconds);
    }
    
    return answer;
  }
}
