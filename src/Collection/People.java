package Collection;

public class People {
    private String Name;
    private int Age;

    public People() {
        super();
    }

    public People(String Name, int Age) {
        super();
        this.Name = Name;
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

}
