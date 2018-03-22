import java.util.ArrayList;
import java.util.List;

public class Circle extends Shapes {
    double radius;

    public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
    }
    public void calculateArea() {
        double area = 3.14 * (this.getRadius() * this.getRadius());
        list.add(area);
        System.out.println("The area of this circle is: " + area);
    }
}