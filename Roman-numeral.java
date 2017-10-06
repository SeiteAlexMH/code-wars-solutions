public class Conversion {

    public String solution(int n) {
        String Answer = "";
        String[] units = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tens  = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] Hundreds ={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thousand ={"","M","MM","MMM"};
        String number = Integer.toString(n);
        
        if(n>=1000){
          Answer+=thousand[Character.getNumericValue(number.charAt(0))];
          Answer+=Hundreds[Character.getNumericValue(number.charAt(1))];
          Answer+=tens[Character.getNumericValue(number.charAt(2))];
          Answer+=units[Character.getNumericValue(number.charAt(3))];
        } else if (n>=100){
          Answer+=Hundreds[Character.getNumericValue(number.charAt(0))];
          Answer+=tens[Character.getNumericValue(number.charAt(1))];
          Answer+=units[Character.getNumericValue(number.charAt(2))];
        } else if (n>=10){
          Answer+=tens[Character.getNumericValue(number.charAt(0))];
          Answer+=units[Character.getNumericValue(number.charAt(1))];
        } else {
          Answer+=units[Character.getNumericValue(number.charAt(0))];
        }
        return Answer;
    }
}
