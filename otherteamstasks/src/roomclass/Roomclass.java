package roomclass;

public class Roomclass {
	public int roomno;
	public String roomtype;
	public float roomarea;
	public void setdata(int roomno, String roomtype, float roomarea) {
		this.roomno = roomno;
		this.roomtype = roomtype;
		this.roomarea = roomarea;
	}
	public void displaydata() {
		System.out.println(this.roomno + this.roomtype + this.roomarea);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Roomclass rmc = new Roomclass();
		rmc.setdata(1,"double", 256);
		rmc.displaydata();
		
	}

}
