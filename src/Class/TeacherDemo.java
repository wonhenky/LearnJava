package Class;

public class TeacherDemo {
	public static void main(String[] args) {
		teacher t = new teacher("t1",23);
		System.out.println(t.toString());
		teacher tq = new teacher("t1", 23);
		System.out.println(t.equals(tq));
	}
	
}
