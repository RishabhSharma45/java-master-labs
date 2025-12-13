package prahar.oops.abstraction;

abstract class Animal {
  abstract void sound();
}
class Dog extends Animal{

	@Override
	void sound() {
		System.out.println("bark");
		
	}
	
}
class Cat extends Animal{

	@Override
	void sound() {
		
		System.out.println("miyayu");
	}
	
}
public class Main1{
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
	}
}