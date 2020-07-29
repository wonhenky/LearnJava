package Regex;

import java.util.Scanner;

/*
*判断功能
*校验邮箱
* 1 键入邮箱
*   12334343@qq.com
*   whk@163.com
* 2 定义邮箱规则
* 3 调用功能判断
*
*/
public class mailRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入邮箱");
        String mail = sc.nextLine();
        System.out.println(mailRegexTest(mail));
        System.out.println(System.currentTimeMillis());

    }
    public static boolean mailRegexTest(String mail){
        return mail.matches("\\w+@\\w{2,6}\\.\\w{2,3}+");
    }

}
