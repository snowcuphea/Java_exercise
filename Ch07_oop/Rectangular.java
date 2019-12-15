package Ch07_oop;

public class Rectangular extends Shape {
	public double width;
	public double hight;

	public Rectangular(){
		
	}
	
	public Rectangular(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.hight = hight;
	}
	

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	

	public void calculationArea() {
		
		super.area = getWidth()*getHight();
		
	}
	

}
