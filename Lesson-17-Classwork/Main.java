class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){


    
  }
  String swapLetter(String letter) {
    String bld= "" ;
    for (int i= 0; i<letter.length(); i++){
      if (letter.equals("e")){
        bld +="%";
      }
        
      }

    }

    return result;
}

  //will use reverse for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }


}