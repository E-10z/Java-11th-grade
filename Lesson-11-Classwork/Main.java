class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   

    
  }
  
  String getUsername(String email){
    int pos = email.indexOf("@");
    return email.substring(0,pos);
  }
  String splitReverse(String s){
    int middle = s.length()/2;
    return s.substring(middle) + s.substring(0,middle);
  }
  String createUsername(String fName, String lName, String osis){
    return fName.substring(0,1) +lName + osis.substring(osis.length()-4);
  }
  
  }
  
