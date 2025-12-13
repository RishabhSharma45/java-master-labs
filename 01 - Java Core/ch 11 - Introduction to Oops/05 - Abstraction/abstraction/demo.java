package prahar.oops.abstraction;

interface hello{
	int a = 10;
}

abstract class Animal1 {
	int r=10;
	Animal1(){
		System.out.println("animal1");
	}
	Animal1(int a){
		System.out.println(a+ "animal2");
	}
	Animal1(int a , int b){
		System.out.println(a+ "animal3");
		
	}
	public void show() {
		System.out.println("animal class ");
	}
}
public class demo extends Animal1 {
	int r=20;
	demo(){
		System.out.println("demo1");
	}
	demo(int a){
		System.out.println(a + "demo2");
	}
	public void show() {
		System.out.println("demo class method");
	}
public static void main(String[] args) {
// demo a=new demo();
// a.show();
// Animal1 t=new demo();
// System.out.println(t.r);//10
// System.out.println(a.r);//20
//	Animal1 a = new demo();
	demo a = new demo(5);

}
}
