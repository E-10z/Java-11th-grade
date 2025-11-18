class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   String[] friends ={"Elmo", "Cookie Monster", "Big Bird", "Oscar the Grouch", "Grover"};

   double[] tempC = {-4.5, 0, 23, 34, 5, 10};

   double[] tempF = convert(tempC);
  
   for(int i=0 ; i<tempF.length; i++){
    print(tempF[i]);
   }

  
  }
   double[] convert(double[] c){
    double[] f = new double[c.length];
    for(int i=0 ; i<c.length; i++){
      f[i] = c[i]*9/5+32;
    }
    return f;
  }
    


  }
  

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
}