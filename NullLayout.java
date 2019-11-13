package giaodiendohoa;
import java.awt.*;

public class NullLayout {
	public static void main(String args[]) {
		Frame f = new Frame("VD trang 107");
		f.setSize(300,200);
		f.setLayout(null);
		Font fo = new Font("Times New Roman",Font.ITALIC, 12 );
		Label l = new Label("Chú thích ");
		l.setBounds(30,50,70,20);
		l.setFont(fo);
		l.setForeground(Color.RED);
		TextField tf = new TextField();
		tf.setBounds(102, 50, 150, 20);
		Button bt = new Button("Exit");
		bt.setBounds(100,100,30,20);
		xlsk x = new xlsk();
        bt.addActionListener(x);
		f.add(l);
		f.add(bt);
		f.add(tf);
		f.setVisible(true);
	}

}
