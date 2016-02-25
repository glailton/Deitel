package cap8;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(){
		length=1;
		width=1;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if(length>0 && length<20)
			this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if(width>0 && width<20)
		this.width = width;
	}
	
	public double calcArea(double length, double width){
		double area = 0;
		area = getLength()*getWidth();
		return area;
	}
	
	public double calcPeri(double length, double width){
		double peri = 0;
		peri = 2*(getLength()+getWidth());
		return peri;
	}
}
