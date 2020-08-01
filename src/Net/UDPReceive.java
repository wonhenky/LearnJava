package Net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 创建接收端的Socket对象
 * 创建数据包(接收容器)
 * 调用Socket对象的接收方法接收数据
 * 解析数据
 * 释放资源
 */
public class UDPReceive {
    public static void main(String[] args) throws IOException {
        //创建接收端Socket对象
        DatagramSocket ds = new DatagramSocket(10086);
        while (true) {
            //创建一个数据包
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);
            //调用Socket对象的接收方法接收数据
            ds.receive(dp);
            //获取对方IP
//        InetAddress address = dp.getAddress();
//        String ip = address.getHostAddress();
            //获取数据缓冲区
            //获取数据的实际长度
            String s = new String(dp.getData(), 0, dp.getLength());
            System.out.println("From:"+ dp.getAddress().getHostAddress() + ", " +
                    "Send:" +s);
        }
        //ds.close();
    }
}
