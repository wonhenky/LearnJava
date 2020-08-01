package Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Socket:网络编程
 *      包含IP地址和端口
 *
 * public static InetAddress getByName(String host):根据主机名或者IP地址的字符串表示得到的IP地址对象
 *
 * 协议
 *  UDP:
 *      把数据打包 限制64kb 不建立连接 速度快 不可靠
 *   TCP:
 *      建立连接 形成传输数据的通道 在连接中进行大量数据量传递 通过三次握手协议 速度慢 可靠
 */
public class InetAdressDemo {
    public static void main(String[] args) {
        InetAddress address;
        {
            try {
                address = InetAddress.getByName("192.168.1.4");
                //获取主机名和IP地址
                String Name = address.getHostName();
                System.out.println("主机名:"+Name);
                String IP = address.getHostAddress();
                System.out.println("IP:"+IP);
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }
    }

}
