package itcast;

import java.util.Scanner;

/**
 * ҳ����
 * 
 * @author Administrator
 * 
 */
public class Menu {

	public Menu() {
	}

	public void setData(String as[], double ad[], int ai[], String as1[],
			int ai1[]) {
		goodsName = as;
		goodsPrice = ad;
		custNo = ai;
		custBirth = as1;
		custScore = ai1;
	}

	public void showLoginMenu() {
		System.out.println("\n\n\t\t\t    ��ӭʹ��itcast�������ϵͳ1.0��\n\n");
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t\t\t 1. �� ¼ ϵ ͳ\n\n");
		System.out.println("\t\t\t\t 2. �� �� �� �� Ա �� ��\n\n");
		System.out.println("\t\t\t\t 3. �� ��\n\n");
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.print("��ѡ��,��������:");
	}

	public void showMainMenu() {
		System.out.println("\n\n\t\t\t\t��ӭʹ�ù������ϵͳ\n");
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t\t\t 1. �� �� �� Ϣ �� ��\n");
		System.out.println("\t\t\t\t 2. �� �� �� ��\n");
		System.out.println("\t\t\t\t 3. �� �� �� ��\n");
		System.out.println("\t\t\t\t 4. ע ��\n");
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.print("��ѡ��,��������:");
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		do {
			String s = scanner.next();
			if (s.equals("1")) {
				showCustMMenu();
				break;
			}
			if (s.equals("2")) {
				Pay pay = new Pay();
				pay
						.setData(goodsName, goodsPrice, custNo, custBirth,
								custScore);
				pay.calcPrice();
				break;
			}
			if (s.equals("3")) {
				showSendGMenu();
				break;
			}
			if (s.equals("4")) {
				showLoginMenu();
				break;
			}
			System.out.print("��������������������֣�");
			flag = false;
		} while (!flag);
	}

	public void showCustMMenu() {
		System.out.println("�������ϵͳ > �ͻ���Ϣ����\n");
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t\t\t 1. �� ʾ �� �� �� �� �� Ϣ\n");
		System.out.println("\t\t\t\t 2. �� �� �� �� �� Ϣ\n");
		System.out.println("\t\t\t\t 3. �� �� �� �� �� Ϣ\n");
		System.out.println("\t\t\t\t 4. �� ѯ �� �� �� Ϣ\n");
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.print("��ѡ��,�������ֻ�'n'������һ���˵�:");
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		do {
			CustManagement custmanagement = new CustManagement();
			custmanagement.setData(goodsName, goodsPrice, custNo, custBirth,
					custScore);
			String s = scanner.next();
			if (s.equals("1")) {
				custmanagement.show();
				break;
			}
			if (s.equals("2")) {
				custmanagement.add();
				break;
			}
			if (s.equals("3")) {
				custmanagement.modify();
				break;
			}
			if (s.equals("4")) {
				custmanagement.search();
				break;
			}
			if (s.equals("n")) {
				showMainMenu();
				break;
			}
			System.out.println("�������, �������������֣�");
			flag = false;
		} while (!flag);
	}

	public void showSendGMenu() {
		System.out.println("�������ϵͳ > �������\n");
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t\t\t 1. �� �� �� �� ��\n");
		System.out.println("\t\t\t\t 2. �� �� �� ��\n");
		System.out.println("\t\t\t\t 3. �� �� �� ��\n");
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.print("��ѡ��,�������ֻ�'n'������һ���˵�:");
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		GiftManagement giftmanagement = new GiftManagement();
		giftmanagement.setData(goodsName, goodsPrice, custNo, custBirth,
				custScore);
		do {
			String s = scanner.next();
			if (s.equals("1")) {
				giftmanagement.sendGoldenCust();
				break;
			}
			if (s.equals("2")) {
				giftmanagement.sendLuckyCust();
				break;
			}
			if (s.equals("3")) {
				giftmanagement.sendBirthCust();
				break;
			}
			if (s.equals("n")) {
				showMainMenu();
				break;
			}
			System.out.println("�������, �������������֣�");
			flag = false;
		} while (!flag);
	}

	public String goodsName[];
	public double goodsPrice[];
	public int custNo[];
	public String custBirth[];
	public int custScore[];
}