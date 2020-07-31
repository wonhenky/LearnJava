package Thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        //super.run();
        for (int i = 0; i < 400; i++) {
            System.out.println(i+getName());
        }
    }
}
