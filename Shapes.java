import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Shapes {

    String shape;
    List<Double> list = new ArrayList<Double>();
    
    public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
    }
    public List<Double> getList() {
        return list;
    }
    public void setList(List<Double> list) {
        this.list = list;
    }

    public List<Double> SortByArea(List<Double> list ) {
        Collections.sort(list);
        return list;
    }

}

// Circle extends Shapes
// Square extends Shapes
// Rectangle extends Shapes
