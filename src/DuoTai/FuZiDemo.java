package DuoTai;
class Fu {
	public void show() {
		System.out.println("show fu");
	}
}

class Zi extends Fu {
	public void show() {
		System.out.println("show zi");
	}
	
	public void method() {
		System.out.println("method zi");
	}

}
public class FuZiDemo {
	public static void main(String[] args) {
		//测试
		Fu f = new Zi();
		f.show();
		//f.method();
		
		//创建子类对象
		//Zi z = new Zi();
		//z.show();
		//z.method();
		
		//你能够把子的对象赋值给父亲，那么我能不能把父的引用赋值给子的引用呢?
		//如果可以，但是如下
		Zi z = (Zi)f;
		z.show();
		z.method();
	}
}
