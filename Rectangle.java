import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Shapes {
    double length;
    double width;

    public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
    }
    public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
    }
    public void calculateArea() {
        double area = this.getLength() * this.getWidth();
        list.add(area);
        list.SortByArea(list);
        System.out.println("The area of this rectangle is: " + area);
    }
}
