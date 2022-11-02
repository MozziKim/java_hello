package chapter7;

public class Circle {
	int radius;
	
	Circle(int r){//int radius
		radius = r;
		//this.radius = radius;
	}
	
	double getArea(int num) {
		return radius * radius * Math.PI;
	}
	
	double getArea() {
		return radius * radius * Math.PI;
	}
}


