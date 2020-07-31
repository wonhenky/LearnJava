package Thread;

public class SellTicket implements Runnable{
    private static int ticket = 100;
    //定义同一把锁
    //private Object obj = new Object();
    private int x = 0;
    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                sellTicket();
            }else {
                sellTicket();
            }
            x++;

        }
    }

    private static void sellTicket() {
        synchronized (SellTicket.class) {
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Thread.yield();
                System.out.println(Thread.currentThread().getName()+"正在出售第"+(ticket--)+"张票");
            }
            if (ticket == 0) {
                System.exit(0);
            }
        }
    }
}
