package IO.Test;


import java.io.*;

/**
 * 复制多级文件
 * 数据源 /Users/meltemi/Downloads/Edge
 * 目的地 /Users/meltemi/
 * 分析
 *      1 封装数据源File
 *      2 封装目的地 File
 *      3 判断该File是文件夹还是文件
 *          a 是文件夹
 *              就在目的地目录下创建该文件夹
 *              获取该File对象的所有文件或者文件夹File对象
 *              遍历得到每一个File对象
 *              回到判断
 *          b 就是文件
 *              直接复制字节流
 */
public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("/Users/meltemi/Downloads/Edge");
        File destFolder = new File("/Users");
        copyFolders(srcFolder, destFolder);
    }

    private static void copyFolders(File srcFolder, File destFolder) throws IOException{
        if (srcFolder.isDirectory()) {
            File newFolder = new File(destFolder, srcFolder.getName());
            newFolder.mkdir();
            File[] files = srcFolder.listFiles();
            for (File file : files) {
                copyFolders(file, newFolder);
            }
        }else{
            File newFile = new File(destFolder, srcFolder.getName());
            copyFile(srcFolder, newFile);
        }
    }

    private static void copyFile(File srcFolder, File newFile) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFolder));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
    }
}
