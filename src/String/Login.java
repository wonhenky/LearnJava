package String;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		String Name = "Meltemi";
		String PassWord = "123";
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 2; i++) {
		System.out.println("请输入用户名:");
		String name = sc.nextLine();
		System.out.println("请输入密码:");
		String pw = sc.nextLine();
		if(name.equals(Name) && pw.equals(PassWord))
			{
				Game.start();
			}
		else 
			{
			System.out.println("帐号错误,请重新输入账号:");
			}		
		
		}

		

		
	}
}
