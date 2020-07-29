package DuoTai;

class Animal {
	public void eat() {
		System.out.println("eat");
	}
	public void sleep() {
		System.out.println("sleep");
	}
}
class Cat extends Animal{
	public void eat() {
		System.out.println("猫吃鱼");
	}
	public void sleep() {
		System.out.println("猫蜷起来睡");
	}
	
}
class Dog extends Animal{
	public void eat() {
		System.out.println("狗吃肉");
	}
	public void sleep() {
		System.out.println("狗趴着睡");
	}
	
}
class AnimalsTool{
	public static void useAnimals(Animal a) {
		a.eat();
		a.sleep();
	}
}
class Animals{
	public static void main(String[] args) {
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Cat c3 = new Cat();

		AnimalsTool at = new AnimalsTool();
		
		at.useAnimals(c1);
		at.useAnimals(c2);
		at.useAnimals(c3);

		
		Dog d1 = new Dog();
		d1.eat();
		d1.sleep();
		Dog d2 = new Dog();
		d2.eat();
		d2.sleep();
		Dog d3 = new Dog();
		d3.eat();
		d3.sleep();
		
		
	}
}