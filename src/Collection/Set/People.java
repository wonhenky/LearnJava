package Collection.Set;

import java.util.Objects;

public class People implements Comparable<People> {
    private String Name;
    private int Age;
    public People(){
        super();
    }

    public People(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Age == people.Age &&
                Objects.equals(Name, people.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Age);
    }

    @Override
    public String toString() {
        return "People{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }

    @Override
    public int compareTo(People s) {
        //return 0;
        //主要条件，按年龄排序
        int num = this.Age - s.Age;
        //次要条件 如果年龄和姓名都相同 才是同一个元素
        int num2 = num == 0 ? this.Name.compareTo(s.Name) : num;
        return num2;
    }
}
