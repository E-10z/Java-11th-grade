class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }

  String creditCardType(String cardNumber) {
    if(cardNumber.substring(0,1).equals(4)){
      return "Visa";
    }
    else if(cardNumber.substring(0,2).equals(34) || cardNumber.substring(0,2).equals(37)){
      return "American Express";
    }
    else if(cardNumber.substring(0,2).equals(36)){
      return "Diner Club";
    }
    else if(cardNumber.substring(0,2).equals(51) || cardNumber.substring(0,2).equals(55)){
      return "Mastercard";
    }
    else if(cardNumber.substring(0,4).equals(6011) || cardNumber.substring(0,2).equals(65)){
      return "Discover";
    }
    else{
      return "Unknown";
    }
  }   
  String pigLatin(String word){
    return word.substring(1) + word.substring(0,1) + "ay";
  }

  boolean validatePassword(String password){
    if(password.length() >= 5 && password.length() <= 8 && password.indexOf("*")==-1 && password.indexOf("^")==-1 && password.indexOf("(")==-1 && password.indexOf(")")==-1){
      return true;
    }
    else{
      return false;
    }
    

  }

    

  }



}