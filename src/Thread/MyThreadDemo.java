package Thread;

/**
 * public final void setDaemon(boolean on)
 * 将该进程标记为守护进程 被保护的进程结束时其他进程陆续结束 该进程在启动线程进程前调用
 * public final void joint()
 * 等待该线程终止
 * public final int getPriority() 返回线程对象的优先级
 * public final void setPriority(int newPriority) 更改线程的优先级
 *      线程默认为5
 *      优先级的范围是1-10
 * public static void sleep(long millis)
 * 线程休眠
 * public void interrupt() 中断进程 把线程的状态终止 并抛出一个InterruptedException
 * public static void yield()
 * 暂停当前正在执行的线程对象 并执行其他线程 可以让线程更加和谐
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        MyThread mt2 = new MyThread();
        mt.setName("Meltmei");
        mt2.setName("Leslie");
        //直接调用run是单线程，应该使用start
        mt.start();
        mt2.start();
    }

}
