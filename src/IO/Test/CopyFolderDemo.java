package IO.Test;
import java.io.*;

/**
 * 复制单级文件夹
 * 数据源
 * 目的地
 * 分析
 *      1 封装目录
 *      2 获取该目录下的所有文件File数组
 *      3 遍历该File数组 得到每一个File对象
 *      4 把该File进行复制
 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        //封装目录
        File srcFolder = new File("/Users/meltemi/Downloads/Edge");
        //封装目的地
        File destFolder = new File("/Users/meltemi/Downloads/Test");
        //如果目的地文件夹不存在 就创建
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }
        //获取数据源目录下的所有文本的File数组
        File[] fileArray = srcFolder.listFiles();
        //listFiles 返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。
        //遍历该File数组 得到每一个File对象
        for (File file : fileArray) {
            String name = file.getName();
            //从父路径名字符串和子路径名字符串创建新的 File实例。
            File newFile = new File(destFolder, name);
            copyFile(file, newFile);
        }


    }

    private static void copyFile(File file, File newFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
            bos.flush();
        }
        bos.close();
        bis.close();
    }


}
