package Collection.List.Login_Register.Game;

import java.util.Scanner;

/**
 * 这是一个猜数字小游戏
 */
public class GuessNumber {
    private GuessNumber(){

    }
    public static void start(){
        int number = (int)(Math.random()*100)+1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int guessNumber = sc.nextInt();
        while (true) {
            if (guessNumber > number){
                System.out.println("Your number "+ guessNumber + "bigger");
            } else if (guessNumber < number) {
                System.out.println("Your number" + guessNumber + "Litter");
            }else {
                System.out.println("Congratulations!");
                break;
            }
        }


    }

}
