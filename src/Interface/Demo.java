package Interface;
interface AnimalTrain{
	public abstract void jump(); 
}
abstract class animal extends Object {
	abstract void eat();
	public animal() {
		
	}
	public void sleep() {
		System.out.println("Sleep");
	}
}

class cat extends animal implements AnimalTrain{
	public void eat() {
		System.out.println("Cat eat Fish");
	}
	public void jump() {
		System.out.println("Cat can jump");
	}
	public void sleep() {
		System.out.println("Cat like roll up sleep");
	}
	
}
public class Demo {
	public static void main(String[] args) {
		animal a = new cat();
		a.eat();
		a.sleep();
		cat c = (cat)a;
		c.jump();
		
	}
}
