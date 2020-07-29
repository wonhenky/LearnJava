package Abstract;

abstract class animals{
	private String Name;
	private int Age;
	public animals(){
		
	}
	public animals(String Name,int Age){
		this.Name = Name;
		this.Age = Age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int Age) {
		this.Age = Age;
	}
	public abstract void eat();
	
}
class cat extends animals{
	public void eat() {
		System.out.println("Cat eat Fish");
	}
	public cat(){
		
	}
	public cat(String Name,int Age){
		super(Name, Age);
	}
}
class dog extends animals{
	public void eat() {
		System.out.println("Dog eat meat");
	}
	public dog(){
		
	}
	public dog(String Name,int Age){
		super(Name, Age);
	}
}
class AnimalTools{
	public void tool(animals a,String Name,int Age) {
		a.eat();
		a.setAge(Age);
		a.setName(Name);
		System.out.println("Age:"+a.getAge()+"\n"+"Name:"+a.getName()+"\n");
	}
	public void tool(animals a) {
		a.eat();
		System.out.println("Age:"+a.getAge()+"\n"+"Name:"+a.getName()+"\n");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		AnimalTools animalTools = new AnimalTools();
		
		animals a1 = new cat();
		a1.eat();
		a1.setAge(2);
		a1.setName("cat1");
		System.out.println("Age:"+a1.getAge()+"\n"+"Name:"+a1.getName()+"\n");
		
		animals a2 = new cat();
		animalTools.tool(a2, "FatCat", 5);
		
		animals b1 = new dog();
		animalTools.tool(b1, "SlimDog", 3);
		
		animals b2 = new dog("FatDog",4);
		//方法重载
		animalTools.tool(b2);
		
		
	}
}
