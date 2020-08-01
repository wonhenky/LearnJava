package Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

//创建发送端的Socket对象 创建数据并打包数据
//调用Socket对象的发送方法发送数据包
public class UDPSend {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象
        DatagramSocket ds = new DatagramSocket();
        //封装键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }

            //创建数据 并打包
            byte[] bys = line.getBytes();
            //创建数据并打包
            DatagramPacket dp = new DatagramPacket(bys, bys.length,
                    InetAddress.getByName("192.168.1.4"), 10086);
            //发送数据
            ds.send(dp);
        }
        //释放资源
        ds.close();
    }

}
