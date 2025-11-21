class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    double[] num = {12,15,22,5,32,34,65,8,45,10,23,9,95,87,56,83};
    print(prices(num));

  }

  double prices(double[] num){
      double sum=0;
      for(int i=0; i<num.length; i++){
        sum += num[i];
      }
      sum *= 1.08525;
      return sum;
    }
    
  boolean isin(int[] nums){
    

  }
  // Use these functions below for the activity

  String convertToEmoji(String code){
    return String.valueOf(Character.toChars(
                               Integer.parseInt(code, 16)));
  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

  boolean isPrime(int n){
    int divisor = 2;
    while(n%divisor !=0){
      divisor+=1;
    }
    if(divisor==n)
      return true;
    else
      return false;
  }
}