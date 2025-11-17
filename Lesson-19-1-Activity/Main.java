class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    rollDice();

    
  }
  void rollDice(){
    int die1 = (int)(Math.random()*6)+1;
    int die2 = (int)(Math.random()*6)+1;
    System.out.println(die1 + "," + die2);
  }

  String lotto(){
    

  }

}