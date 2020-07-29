package Map.HashMap;

import java.util.Objects;

public class People {
    private String Name;
    private int Age;

    public People() {
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
}
