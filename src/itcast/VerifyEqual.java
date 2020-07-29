package itcast;

import java.util.Scanner;

/**
 * ��֤����Ա��¼
 * 
 * @author Administrator
 * 
 */
public class VerifyEqual {

	public VerifyEqual() {
	}

	public boolean verify(String s, String s1) {
		System.out.print("�������û�����");
		Scanner scanner = new Scanner(System.in);
		String s2 = scanner.next();
		System.out.print("���������룺");
		scanner = new Scanner(System.in);
		String s3 = scanner.next();
		return s2.equals(s) && s1.equals(s3);
	}
}