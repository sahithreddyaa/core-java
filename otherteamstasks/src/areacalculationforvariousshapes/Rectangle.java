package areacalculationforvariousshapes;

public class Rectangle implements Area{
	int a;
	int b;
	Rectangle(int a, int b){
		this.a = a;
		this.b = b;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		int value = a*b;
		System.out.print("The Area is:");
		System.out.println(value);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(5,6);
		r.area();
	}



}
