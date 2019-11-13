package giaodiendohoa;
import java.awt.*;

public class PTB2 {
	public static void main(String args[]) {
		Frame f = new Frame("PTB2");
		f.setSize(600,400);
		f.setLayout(null);
		Label l1 = new Label("Giải Phương Trình bậc 2 có dạng: ax^2 + bx + c =?? ");
		l1.setBounds(50,50,400,30);
		
		Label l2 = new Label("Nhap vao phan tu a: ");
		l2.setBounds(50,90,200,30);		
		TextField tf1 = new TextField();
		tf1.setBounds(250,90,60,30);
		
		Label l3 = new Label("Nhap vao phan tu b: ");
		l3.setBounds(50,140,200,30);		
		TextField tf2 = new TextField();
		tf2.setBounds(250,140,60,30);
		
		Button bt = new Button("Exit");
		bt.setBounds(400,350,30,20);
		xlsk x = new xlsk();
        bt.addActionListener(x);
        f.add(bt);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(tf1);
        f.add(tf2);
        f.setVisible(true);
	}

}
