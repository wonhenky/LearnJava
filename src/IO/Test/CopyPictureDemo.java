package IO.Test;

import sun.text.resources.iw.FormatData_iw_IL;

import java.io.*;

/**
 * 复制图片
 * 分析
 *      复制数据
 * 数据源
 *      QQ.jpg -- FileInputStream -- BufferedInputStream
 * 目的地
 *      QQCopy.jpg -- FileOutputStream -- BufferedOutputStream
 *
 */
public class CopyPictureDemo {
    public static void main(String[] args) throws IOException{

        //使用字符串作为路径
        //String srcString = "QQ.jpg";
        //String destString = "QQ.jpg";
        //使用File对象作为参数
        File srcFile = new File("QQ.jpg");
        File destFile = new File("QQCopy.jpg");
        //method1(srcFile,destFile);
//        method2(srcFile,destFile);
//        method3(srcFile,destFile);
//        method4(srcFile,destFile);
    }
//一次读写一个字节
    private static void method1(File srcFile, File destFile) throws IOException {
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fos.close();
        fis.close();
    }
    //一次读写一个字节组
    private static void method2(File srcFile, File destFile) throws IOException {
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();
    }
    //字节缓冲流一次一个字节
    private static void method3(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        int by = 0;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }
        bis.close();
        bos.close();
    }
    //字节缓冲流一次一个字节数组
    private static void method4(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
    }

}
