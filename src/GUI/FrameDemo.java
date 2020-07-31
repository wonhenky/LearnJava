package GUI;
//Abstract Window ToolKit(awt)
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;//带有标题和顶层的窗口 Window的子类
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("Java GUI");
		//设置初识点，和窗口大小
		f.setBounds(400, 200, 400, 270);
		//设置布局方案为FlowLayout
		f.setLayout(new FlowLayout());
		//创建文本框
		final TextField tf = new TextField(20);
		//创建按钮对象
		Button b = new Button("add");
		b.setSize(20, 10);
		Button bc = new Button("clear");
		bc.setSize(20, 10);
		
		//创建文本域
		TextArea ta = new TextArea(10, 40);
		
		//添加到窗体
		f.add(tf);
		f.add(b);
		f.add(bc);
		f.add(ta);
		//让窗体关闭
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
					
		}); 
		bc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String t = "";
				ta.setText(t);
			}
		});
		//对按钮添加事件
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 	获取文本框的值
				String tf_str = tf.getText().trim();
				//设置给文本域
				ta.append(tf_str+"\r\n");
				//获取光标
				tf.requestFocus();
				
			}
		});
		//设置窗口可见
		f.setVisible(true);
		
	}
}
