package Collection.List.Login_Register.Test;

import Collection.List.Login_Register.Dao.UserDao;
import Collection.List.Login_Register.impl.UserDaoImpl;
import Collection.List.Login_Register.pojo.User;
import Collection.List.Login_Register.Game.GuessNumber;
import java.util.Scanner;

/**
 * 用户测试类
 */
public class UserTest {
    public static void main(String[] args) {
        while (true) {
            System.out.println("----------Welocome----------");
            System.out.println("1 Login");
            System.out.println("2 Register");
            System.out.println("3 Exit");
            System.out.println("Please input your choose:");

            Scanner sc = new Scanner(System.in);
            //为了后面录入信息的方便，后面都用字符接收
            String choiceString = sc.nextLine();
            //多态调用 Switch 多处地方要调用就定义到外面
            UserDao ud = new UserDaoImpl();
            switch (choiceString){
                case "1":
                    System.out.println("----------Register----------");
                    System.out.println("Please enter you Name");
                    String UserName = sc.nextLine();
                    System.out.println("Please enter you Password");
                    String PassWord = sc.nextLine();
                    //调用对象功能
                    boolean flag = ud.isLogin(UserName, PassWord);
                    if (flag) {
                        System.out.println("Success");
                        System.out.println("Do you want to play game? Y/N");
                        while (true) {
                            String resultString = sc.nextLine();
                            if (resultString.equalsIgnoreCase("Y")) {
                                GuessNumber.start();
                                System.out.println("Play Again ? Y/N");
                            }else{
                                break;
                            }
                        }



                        System.exit(0);
                    }else{
                        System.out.println("Your Name or Password is wrong");
                    }
                    break;
                case "2":
                    System.out.println("----------Register----------");
                    System.out.println("Please enter you Name");
                    String newUserName = sc.nextLine();
                    System.out.println("Please enter you Password");
                    String newPassWord = sc.nextLine();
                    //把用户名和密码封装到一个对象中
                    User user = new User();
                    user.setUsername(newUserName);
                    user.setPassword(newPassWord);
                    //调用注册接口

                    //具体类使用
                    //UserDaoImpl udi = new UserDaoImpl();
                    ud.register(user);
                    break;
                case "3":
                default:
                    System.out.println("Exit!");
                    System.exit(0);
                    break;

            }
        }

    }
}
