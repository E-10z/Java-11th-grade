class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    Car car1 = new Car("Toyota", "Red", "Corolla", 2020, 20000);


    Car car2 = new Car("Honda", "Blue", "Civic", 2018, 18000);

    System.out.println("Car 1:");
      
    

    


  }


  


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}