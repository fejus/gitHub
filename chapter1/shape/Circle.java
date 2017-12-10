package chapter1.shape;

public class Circle extends Shape {
	private double r;

	public Circle() {
		super();
	}

	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	public double area() {
		this.area = Math.PI * this.r * this.r;
		return this.area;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

}
