package Class;

class Phone {
	static private String Brand;
	private String Model;
	private int Price;
	private String Color;
	
	Phone(){
		
	}
    Phone(String Model,int Price,String Color){
		
		this.Model = Model;
		this.Price = Price;
		this.Color = Color;
	}
	public void Show() { 
		System.out.println(Brand+"\n"+Model+"\n"+Price+"\n"+Color+"\n");
	}
	public void SetBrand(String Brand){
		this.Brand = Brand;
	}

	
}
class PhoneTest{
	
	public static void main(String[] args) {
		Phone p = new Phone("Lumia920",4699,"Yellow");
		Phone p1 = new Phone("Lumia1020",6999,"White");
		p.SetBrand("Nokia");
		p.Show();
		p1.Show();
	
	}
}
