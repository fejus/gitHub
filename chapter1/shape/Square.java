package chapter1.shape;

public class Square extends Shape {
	private double width, height;

	public Square() {
		super();
	}

	public Square(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		this.area = this.width * this.height;
		return this.area;
	}

	@Override
	public String toString() {
		return "Square [width=" + width + ", height=" + height + "]";
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
