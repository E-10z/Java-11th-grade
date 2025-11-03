class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    space(10);
    
  }
 void space( int n){
  String result= " ";
    for (int i=0; i<n; i++){
      result +=" ";
    }
    print(result+"DONE");
  }
 }

