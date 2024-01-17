package amazon.test.tre;

public class GreensTechnology{
	private void java() {
		System.out.println("java course started");
	
	}
	private void selenium() {
		System.out.println("selenium not yet started");
	}
	private void python() {
		System.out.println("python is not our course");
	}
	public static void main(String[] args) {//1//CLASSNAME VAR/OBJ/REF=new CLASSNAME();
		GreensTechnology cd=new GreensTechnology();
		cd.java();
		cd.selenium();
		cd.python();
	}
}


