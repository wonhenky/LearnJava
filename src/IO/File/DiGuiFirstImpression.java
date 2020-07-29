package IO.File;

/**
 * 递归 方法定义中调用方法本身的现象
 *  分解法
 *  合并法
 *      一定要有出口 否则为死递归
 *      递归次数不能太多 否则会内存溢出
 *      构造方法不能递归使用
 */
public class DiGuiFirstImpression {

    public static void main(String[] args) {
        RabbitArray();
        System.out.println(RabbitDiDui(20));
    }

    //阶乘
    public static int JieCheng(int n) {
        if (n == 1) {
            return 1;
        }else {
            return n * JieCheng(n - 1);
        }
    }

    /**
     * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
     * 假如兔子都不死，问第20个月的兔子对数为多少？
     * 规律
     * 第一个月 1
     * 第二个月 1
     * 第三个月 2
     * 第四个月 3
     * 第五个月 5
     * 第六个月 8
     * 实现方式
     * 数组实现
     */
    public static void RabbitArray() {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i-1];
        }
        System.out.println("一共"+arr[19]+"只兔子");
    }

    public static int RabbitDiDui(int n) {
        if(n==1 || n==2){
            return 1;
        }else {
            return RabbitDiDui(n - 1) + RabbitDiDui(n - 2);
        }
    }

    /**
     * 递归删除带内容文件
     *
     */
    public static void FileDeleteDemo() {

    }


}
