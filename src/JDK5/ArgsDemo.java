package JDK5;

public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(3,4,5,6,7,8,8,9999,323));
    }
    public static int sum(int... a){
        int s = 0;
        for(int i : a){
            s += i;
        }
        return s;
    }

}
