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

	double m = coneVolume(10,20);
	System.out.println(m);

	double d= distance(1,2,4,6);
	System.out.println(d);
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
  
  double coneVolume(double x, double h){
	double m = Math.sqrt(3.0 * x / (Math.PI* x * x * h));
	return m;
  }

  double distance(double x1, double y1, double x2, double y2){
	double d = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
	return d;
  }
}
  
