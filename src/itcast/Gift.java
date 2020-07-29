package itcast;

/**
 * ������
 */
public class Gift {

	public Gift() {
	}

	public String toString() {
		return (new StringBuilder()).append("һ����ֵ��").append(price).append("��")
				.append(name).toString();
	}

	public String name;
	public double price;
}