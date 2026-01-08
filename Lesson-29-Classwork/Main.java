class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    Dog dog1 = new Dog();
    dog1.name = "Jude";
    dog1.age = 4;
    dog1.breed = "Beagle";
    

    
   
    
  }




  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}