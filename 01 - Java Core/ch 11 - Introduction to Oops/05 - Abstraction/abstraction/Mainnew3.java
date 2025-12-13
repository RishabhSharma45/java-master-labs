package prahar.oops.abstraction;

abstract class Shape2{
	abstract double area();
	abstract double perimeter();
}
class Circle2 extends Shape2{
	
	int r;
	
	Circle2(int r){
		this.r = r;
	}

	@Override
	double area() {
		return Math.PI*r*r;
	}

	@Override
	double perimeter() {
		return 2*Math.PI*r;
	}
	
}
class Rectangle2 extends Shape2{
	
	int l,b;
	
	Rectangle2(int l , int b){
		this.l=l;
		this.b=b;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return l*b;
	}

	@Override
	double perimeter() {
		// TODO Auto-generated method stub
		return 2*(l+b);
	}
	
}
public class Mainnew3 {
 public static void main(String[] args) {
	Shape2[] shape = {new Circle2(5),new Rectangle2(5,2), new Circle2(8)};
	for(Shape2 a  : shape) {
		System.out.println(a.area());
		System.out.println(a.perimeter());
		
	}
}
}
