import java.awt.*;
import java.awt.event.*;

public class PTb2 implements ActionListener, WindowListener {
	Frame PTB2=new Frame("Phương trình bậc 2");
	Label a=new Label("Nhap a");
	Label b=new Label("Nhap b");
	Label c=new Label("Nhap c");
	Label chon=new Label("Chon: ");
	TextField aa=new TextField();
	TextField bb=new TextField();
	TextField cc=new TextField();
	TextField kq=new TextField();
	Button btexit = new Button("Exit");
	Button btrun= new Button("Run");
	Button btreset= new Button("Reset");
	public PTb2() {
		PTB2.addWindowListener(this);
		btexit.addActionListener(this);
		btrun.addActionListener(this);
		btreset.addActionListener(this);
		PTB2.add(a);
		PTB2.add(b);
		PTB2.add(c);
		PTB2.add(chon);
		PTB2.add(aa);
		PTB2.add(bb);
		PTB2.add(cc);
		PTB2.add(kq);
		PTB2.add(btexit);
		PTB2.add(btrun);
		PTB2.add(btreset);
		PTB2.setVisible(true);
	}
	 @Override
	    public void actionPerformed(java.awt.event.ActionEvent e) {
	    	if(e.getSource()==this.btexit)
	    		System.exit(0);
	 }

	@Override
	public void windowActivated(WindowEvent arg0) {
		
	}


	@Override
	public void windowClosed(WindowEvent arg0) {
		
	}


	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}


	@Override
	public void windowDeactivated(WindowEvent arg0) {
		
	}


	@Override
	public void windowDeiconified(WindowEvent arg0) {
		
	}


	@Override
	public void windowIconified(WindowEvent arg0) {
		
	}


	@Override
	public void windowOpened(WindowEvent arg0) {
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}


	
}
