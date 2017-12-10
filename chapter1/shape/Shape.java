package chapter1.shape;

public class Shape {
	double area;

	public Shape() {
		super();
	}

	public Shape(double area) {
		super();
		this.area = area;
	}

	public double area() {
		return this.area;
	}

	@Override
	public String toString() {
		return "Shape [area=" + area + "]";
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}
