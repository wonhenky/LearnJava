package IO.File;

import java.io.*;

public class FileIOStreamDemo {
    public static void main(String[] args) throws IOException {
        //追加append
        FileOutputStream fop = new FileOutputStream("fop.txt",true);
        //写数据
        //fop.write("Hello IO".getBytes());
        //释放资源
        //fop.close();
         /*
          为什么要close
          1 让流对象关闭变成关机被垃圾回收器回收。finalize()
          2 通知系统去释放跟该文件相关的资源
         */

        //创建字节输入流
        FileInputStream fis = new FileInputStream("fop.txt");
        //读取数据的方式 1 int read() 到达末尾返回-1     2 int read(byte[] b)
        int by = fis.read();
        while (by != -1) {
            System.out.print((char) by);
            by = fis.read();
        }
        fis.close();
    }
}
