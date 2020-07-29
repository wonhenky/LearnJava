package itcast;

import java.util.Scanner;

/**
 * ϵͳ������
 * 
 * @author Administrator
 * 
 */
public class StartSMS {

	public StartSMS() {
	}

	public static void main(String args[]) {
		Data data = new Data();
		data.ini();
		Menu menu = new Menu();
		menu.setData(data.goodsName, data.goodsPrice, data.custNo,
				data.custBirth, data.custScore);
		menu.showLoginMenu();
		boolean flag = true;
		label0: do {
			if (!flag)
				break;
			Scanner scanner = new Scanner(System.in);
			int i = scanner.nextInt();
			VerifyEqual verifyequal = new VerifyEqual();
			switch (i) {
			case 1: // '\001'
				int j = 3;
				do {
					if (j < 1)
						continue label0;
					if (verifyequal.verify(data.manager.username,
							data.manager.password)) {
						menu.showMainMenu();
						continue label0;
					}
					if (j != 1) {
						System.out.println("\n�û��������벻ƥ�䣬���������룺");
					} else {
						System.out.println("\n��û��Ȩ�޽���ϵͳ��лл��");
						flag = false;
					}
					j--;
				} while (true);

			case 2: // '\002'
				if (verifyequal.verify(data.manager.username,
						data.manager.password)) {
					System.out.print("�������µ��û�����");
					data.manager.username = scanner.next();
					System.out.print("�������µ����룺");
					data.manager.password = scanner.next();
					System.out.println("�û����������Ѹ��ģ�");
					System.out.println("\n��ѡ���������֣�");
				} else {
					System.out.println("��Ǹ����û��Ȩ���޸ģ�");
					flag = false;
				}
				break;

			case 3: // '\003'
				System.out.println("лл����ʹ�ã�");
				//flag = false;
				System.exit(0);
				break;

			default:
				System.out.print("\n��������������ѡ����������: ");
				break;
			}
		} while (flag);
	}
}