package Ch07_oop;

public abstract class Shape {
	
	protected double area;
	private String name;
	
	public Shape() {
		
	}
	public Shape(String name) {
		this.name = name;
	}
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void calculationArea();
	
	public void print() {
		System.out.println(getName()+"의 면적은 "+ getArea());
	}

}
