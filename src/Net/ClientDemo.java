package Net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * TCP协议发送数据
 *      创建发送端Socket对象 只一步如果成功 就说明连接建立成功
 *      获取输出流 写数据
 *      释放资源
 *
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端Socket对象
        //Socket s = new Socket(InetAddress.getByName("Address"),port);
        Socket s = new Socket("192.168.1.4", 8888);
        //获取输出流 写数据
        //public OutputStream getOutputStream()
        OutputStream os = s.getOutputStream();
        os.write("Hello TCP".getBytes());
        s.close();
    }
}
