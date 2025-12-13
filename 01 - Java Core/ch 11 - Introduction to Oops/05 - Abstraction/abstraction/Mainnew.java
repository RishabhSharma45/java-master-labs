package prahar.oops.abstraction;

abstract class Shape{
	abstract void area();
}
class Circle extends Shape{
	
	int r;
	Circle(int r){
	 this.r=r;
	}

	@Override
	void area() {
		System.out.println("area of circle - " + Math.PI*r*r );
		
	}
	
}
class Rectangle extends Shape{
	
	int a,b;
	Rectangle(int a , int b){
		this.a=a;
		this.b=b;
	}

	@Override
	void area() {
		System.out.println(a*b);
		
	}
	
}
public class Mainnew {
  public static void main(String[] args) {
	Circle c = new Circle(5);
	c.area();
	Rectangle r = new Rectangle(2,6);
	r.area();
}
}
