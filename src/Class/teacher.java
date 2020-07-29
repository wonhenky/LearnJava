package Class;

public class teacher {
	String Name = "Meltemi";
	int age;
	public teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public teacher(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "teacher [Name=" + Name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + age;
		return result;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		teacher other = (teacher) obj;
//		if (Name == null) {
//			if (other.Name != null)
//				return false;
//		} else if (!Name.equals(other.Name))
//			return false;
//		if (age != other.age)
//			return false;
//		return true;
//	}
//	
	

}
