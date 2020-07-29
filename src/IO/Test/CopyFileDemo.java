package IO.Test;

import java.io.*;

/**
 * 复制文本文件
 * 分析:
 *      复制数据，如果我们知道用记事本打开并能够读懂 就用字符流 否则用字节流
 *      通过该原理 我们知道我们应该采用字符流更方便一点
 *      而字符流有5种方式 所以这个题目我们有5种方式 推荐掌握第五种
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        String srcString = "fop.txt";
        String desString = "a.txt";
        method1(srcString, desString);
        method2(srcString, desString);
        method3(srcString, desString);
        method4(srcString, desString);
        method5(srcString, desString);
    }

    //基本字节流一次读写一个字符
    private static void method1(String srcString, String destString) throws IOException {
        FileReader fr = new FileReader(srcString);
        FileWriter wr = new FileWriter(destString);
        int len = 0;
        while ((len = fr.read()) != -1) {
            wr.write((char) len);
            wr.flush();
        }
        fr.close();
        wr.close();
    }

    //基本字节流一次读一个字符数组
    private static void method2(String srcString, String destString) throws IOException{
        FileReader fr = new FileReader(srcString);
        FileWriter wr = new FileWriter(destString);
        int len = 0;
        char[] str = new char[1024];
        while ((len = fr.read(str)) != -1) {
            wr.write(str, 0, len);
        }
        fr.close();
        wr.close();
    }
    //高效字符缓冲流读写一次字符
    private static void method3(String srcString, String destString) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destString));
        int len = 0;
        while ((len = br.read()) != -1) {
            bw.write(len);
        }
        br.close();
        bw.close();
    }
    //高效字符缓冲流读写一次字符组
    private static void method4(String srcString, String destString) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destString));
        int len = 0;
        char[] ch = new char[1024];

        while ((len = br.read(ch)) != -1) {
            bw.write(ch, 0, len);
        }
        br.close();
        bw.close();
    }
    //高效字符缓冲流读写一次字符串
    private static void method5(String srcString, String destString) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destString));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }

}
