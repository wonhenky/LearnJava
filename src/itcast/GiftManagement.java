package itcast;

import java.util.Scanner;

/**
 * ���������
 * 
 * @author Administrator
 * 
 */
public class GiftManagement {

	public GiftManagement() {
	}

	public void setData(String as[], double ad[], int ai[], String as1[],
			int ai1[]) {
		goodsName = as;
		goodsPrice = ad;
		custNo = ai;
		custBirth = as1;
		custScore = ai1;
	}

	public void returnLastMenu() {
		System.out.print("\n\n�밴'n'������һ���˵�:");
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		do
			if (scanner.next().equals("n")) {
				Menu menu = new Menu();
				menu.setData(goodsName, goodsPrice, custNo, custBirth,
						custScore);
				menu.showSendGMenu();
			} else {
				System.out.print("�������, ������'n'������һ���˵���");
				flag = false;
			}
		while (!flag);
	}

	public void sendBirthCust() {
		System.out.println("�������ϵͳ > �����ʺ�\n\n");
		System.out.print("��������������(��/��<����λ��ʾ>)��");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(s);
		String s1 = "";
		boolean flag = false;
		for (int i = 0; i < custBirth.length; i++)
			if (custBirth[i] != null && custBirth[i].equals(s)) {
				s1 = (new StringBuilder()).append(s1).append(custNo[i]).append(
						"\n").toString();
				flag = true;
			}

		if (flag) {
			System.out.println("�����յĻ�Ա�ǣ�");
			System.out.println(s1);
			System.out.println("��ϲ������MP3һ����");
		} else {
			System.out.println("����û�й����յĻ�Ա��");
		}
		returnLastMenu();
	}

	public void sendLuckyCust() {
		System.out.println("�������ϵͳ > ���˳齱\n\n");
		System.out.print("�Ƿ�ʼ��y/n����");
		Scanner scanner = new Scanner(System.in);
		if (scanner.next().equals("y")) {
			int i = (int) (Math.random() * 10D);
			boolean flag = false;
			String s = "";
			for (int k = 0; k < custNo.length && custNo[k] != 0; k++) {
				int j = (custNo[k] / 100) % 10;
				if (j == i) {
					s = (new StringBuilder()).append(s).append(custNo[k])
							.append("\t").toString();
					flag = true;
				}
			}

			if (flag)
				System.out.println((new StringBuilder()).append("���˿ͻ�����MP3��")
						.append(s).toString());
			else
				System.out.println("�����˿ͻ���");
		}
		returnLastMenu();
	}

	public void sendGoldenCust() {
		System.out.println("�������ϵͳ > ���˴����\n\n");
		int i = 0;
		int j = custScore[0];
		for (int k = 0; k < custScore.length && custScore[k] != 0; k++)
			if (custScore[k] > j) {
				j = custScore[k];
				i = k;
			}

		System.out.println((new StringBuilder()).append("������߻��ֵĻ�Ա�ǣ� ").append(
				custNo[i]).append("\t").append(custBirth[i]).append("\t")
				.append(custScore[i]).toString());
		Gift gift = new Gift();
		gift.name = "ƻ���ʼǱ�����";
		gift.price = 12000D;
		System.out.print("��ϲ��������Ʒ�� ");
		System.out.println(gift);
		returnLastMenu();
	}

	public String goodsName[];
	public double goodsPrice[];
	public int custNo[];
	public String custBirth[];
	public int custScore[];
}