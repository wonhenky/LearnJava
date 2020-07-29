package String;
import java.util.Random;
import java.util.Scanner;

public class Game {
	private Game(){
		
	}
	public static void main(String[] args) {
		start();
	}
	public static void start(){
		Random r = new Random();
		int Number = r.nextInt(100);
		Scanner sc = new Scanner(System.in);
		System.out.println("开始猜数字!");
		while(true) {
			int Guess = sc.nextInt();
			if(Guess == Number) { 
				System.out.println("恭喜你猜对了!");
			}
			else if(Guess < Number) {
				System.out.println("数字小了");
			}
			else if(Guess > Number) {
				System.out.println("数字大了");
			}
		}
		
	}
}
