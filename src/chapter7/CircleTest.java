package chapter7;

class Rectangle {
	int rw; //int width, height;
	int rh;
	
	Rectangle(int w, int h){ //(int width, int height)
		rw = w;	//this.width = width;
		rh = h;	//this.height = height;
	}
	double getArea() {
		return rw * rh; //retrun width * height;
	}
}

public class CircleTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle(10);
    	System.out.println(circle.getArea());
    	
    	Rectangle rec = new Rectangle(10,20);
    	System.out.println(rec.getArea());
    	
    	Total total = new Total(10);
    	System.out.println(total.getSum());



	}

}
