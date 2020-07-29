package Collection;

public class peopleTest {
    public static void main(String[] args) {
        People[] people = new People[4];
        People p0 = new People("Meltemi",22);
        People p1 = new People("Steve Jobs",50);
        People p2 = new People("Leslie",60);
        People p3 = new People("Java",70);
        people[0] = p0;
        people[1] = p1;
        people[2] = p2;
        people[3] = p3;
        for(int i = 0; i < people.length; i ++){
            People p = people[i];
            System.out.println(p.getName()+"---"+p.getAge());
        }

    }
}
