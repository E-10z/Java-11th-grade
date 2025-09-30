class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
	print("Hello");

	double c = FtoC(100);
	System.out.println(c); 

	double v = sphereVolume(10);
	System.out.println(v);

	double m = coneRadius(10,20);
	System.out.println(m);
  }
  
  void print(String msg){
	System.out.println(msg);
  }

  double FtoC(double f){
	double c= (f-32)*5/9.0;
	return c;
  }

  double sphereVolume(double r){
	double v= (4/3.0)*Math.PI*Math.pow(r,3);
	return v;
  }
  
  double coneRadius(double x, double h){
	double m = Math.sqrt(3.0 * x / (Math.PI * h));
	return m;
  }

  double distance(double x1, double y1, double x2, double y2){
}
