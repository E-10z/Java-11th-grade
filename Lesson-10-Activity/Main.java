
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		System.out.println(gpa(93));

		if(isGraduating(45, 12)){
			System.out.println("You are graduating!");
		}
		else{
			System.out.println("You are not graduating.");
		}

		System.out.println(isGraduating(30,10));
  
   

  }

  double gpa (double gpaValue){
	if (gpaValue >= 90.0){
		return gpaValue * 1.1;
	}
	else{
		return gpaValue;
	}
}
	boolean isGraduating (int credits, int gradeLevel){
		if (gradeLevel==12 && credits >= 44){
			return true;
		}
		else{
			return false;
		}
	}

	
  }
  
