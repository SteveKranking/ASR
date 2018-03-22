import java.util.ArrayList;
import java.util.List;

public class Square extends Shapes {
    double side;

    public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
    }
    public void calculateArea() {
        double area = this.getSide() * this.getSide();
        list.add(area);
        list.SortByArea();
        System.out.println("The area of this square is: " + area);
    }
}