package IO.File;
import java.io.*;

/**
 * 因为定义数组的方式比单个字节快了很多，所以有一个缓冲区是非常必要的
 *
 * 写数据 BufferOutputStream
 * 读数据 BufferInputStream
 * 构造方法可以制定缓冲区的大小，一般用不上，因为一般缓冲区的大小就够了
 * 为什么不传递一个具体文件或路径，而是传递一个outputStream对象呢
 * 因为字节缓冲流仅仅提供缓冲区，而为了高效设计。但是呢真正读写操作还得靠基本的流对象实现
 */
public class BufferOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("fop.txt"));
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("fop.txt"));
        byte[] by = new byte[1024];
        int len = 0;
        while ((len = bis.read(by))!= -1) {
            
        }

    }
}
