package Interface;
abstract class people extends Object {
	protected String Name;
	protected int Age;
	people(){}
	people(String Name,int Age){
		this.Name = Name;
		this.Age = Age;
	}
	abstract void eat();
	public void sleep() {
		System.out.println("Sleep");
	}
	
}
abstract class player extends people{
	abstract void training();
	player(){
		
	}
	player(String Name,int Age){
		super(Name,Age);
	}
}
abstract class coach extends people{
	abstract void teach();
	coach(){
		
	}
	coach(String Name,int Age){
		super(Name,Age);
	}
}
interface LearnEnglish{
	public void learnenglish();
}
class PingPangPlayer extends player implements LearnEnglish {
	public void eat() {
		System.out.println("PingPangPlayer Like eat rise");
	}
	public void learnenglish () {
		System.out.println("Player need learn english");
	}
	public void training() {
		System.out.println("player need to training");
	}
	PingPangPlayer(){
		
	}
	PingPangPlayer(String Name,int Age){
		super(Name,Age);
	}
	
}
class BasketBallPlayer extends player{
	public void eat() {
		System.out.println("BasketBallPlayer Like eat noodle");
	}
	public void training() {
		System.out.println("player need to training");
	}
	public BasketBallPlayer() {
		// TODO Auto-generated constructor stub
	}
	public BasketBallPlayer(String Name,int Age){
		super(Name,Age);
	}
	
}
class BasketBallCoach extends coach{
	public BasketBallCoach() {
		// TODO Auto-generated constructor stub
	}
	public BasketBallCoach(String Name,int Age) {
		super(Name,Age);
	}
	public void eat() {
		System.out.println("BasketBallCoach like eat fish");
	}
	public void teach() {
		System.out.println("Coach need to teach");
	}
}
class PingPangCoach extends coach implements LearnEnglish{
	public PingPangCoach() {
		// TODO Auto-generated constructor stub
	}
	public PingPangCoach(String Name,int Age) {
		super(Name,Age);
	}
	public void eat() {
		System.out.println("PingPangCoach like eat meat");
	}
	public void teach() {
		System.out.println("Coach need to teach");
	}
	public void learnenglish() {
		System.out.println("PingPanfCoach need to learn English");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		PingPangPlayer ppp = new PingPangPlayer("乒乓运动员",20);
		ppp.eat();
		ppp.sleep();
		ppp.learnenglish();
		ppp.training();
		PingPangCoach ppc = new PingPangCoach("乒乓教练",40);
		ppc.eat();
		ppc.sleep();
		ppc.learnenglish();
		ppc.teach();
		BasketBallPlayer bbp = new BasketBallPlayer("篮球运动员", 21);
		bbp.eat();
		bbp.sleep();
		bbp.training();
		BasketBallCoach bbc = new BasketBallCoach("篮球教练", 39);
		bbc.eat();
		bbc.sleep();
		bbc.teach();
		
	}
}
