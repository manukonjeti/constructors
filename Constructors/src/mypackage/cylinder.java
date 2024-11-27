package mypackage;

public class cylinder {
	private int radius;
	 private int height;
 public cylinder(int r, int h) {
		this.radius=r;
		this.height=h;
	}
	
	public int getradius() {
		
		return radius;
		
	}
	public int getheight() {
		return  height;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cylinder c=new cylinder(66,77);
		System.out.println(c.getradius());

	}

}
