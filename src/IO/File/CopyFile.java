package IO.File;

import java.io.*;

/**
 * 复制文本文件
 *  数据源 从哪里来
 *
 *  目的地 到哪里去
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        //封装数据源
        FileInputStream fis = new FileInputStream("fop.txt");
        FileOutputStream fos = new FileOutputStream("b.txt");
        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        //释放d资源，先关谁都可以
        fis.close();
        fos.close();


    }
}
