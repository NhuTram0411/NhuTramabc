import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PTBTwo implements ActionListener, KeyListener {
    // Khai thuoc tinh la cac thanh phan
	public Frame t;
	public Label a,b,c,d;
    private Button btExit;
    private Button btRun;
    private Button btReset;
    private Button them;
    private TextField aa;
    private TextField bb;
    private TextField cc;
    private TextField dd;
    public PTBTwo() {
        // Tao cac component
        taoThanhPhan();
        // Them cac components vao frame: add()
        themThanhPhan();
        // Layout cac components
        xepThanhPhan();
        dangKy();
        // Dang ky cac components voi thanh phan xu ly su kien: THIS
        t.setVisible(true);
        dd.setVisible(false);
    }
    
    private void taoThanhPhan() {
        //
    	t=new Frame("Thuc thi");
    	a=new Label("Nhap a");
    	b=new Label("Nhap b");
    	c=new Label("Nhap c");
    	d=new Label("Chon: ");
    	aa=new TextField();
    	bb=new TextField();
    	cc=new TextField();
    	dd=new TextField();
        btExit = new Button("Exit");
        btRun= new Button("Run");
        btReset= new Button("Reset");
        them=new Button("Ấn");
    }
    
    private void themThanhPhan() {
        //
    	t.add(a);
    	t.add(aa);
    	t.add(b);
    	t.add(bb);
    	t.add(c);
    	t.add(cc);
    	t.add(d);
    	t.add(dd);
        t.add(btRun);
        t.add(btExit);
        t.add(btReset);
        t.add(them);
    }
    
    private void xepThanhPhan() {
    	t.setLayout(null);
    	a.setBounds(10, 30, 60 ,20 );
    	aa.setBounds(90, 30, 180 ,30 );
    	b.setBounds(10, 80, 60 , 20);
    	bb.setBounds(90, 80, 180 , 30);
    	c.setBounds(10, 130, 60 , 20);
    	cc.setBounds(90, 130, 180 , 30);
    	d.setBounds(10, 200, 60 , 40);
    	dd.setBounds(350, 30, 400, 60);
    	btRun.setBounds(130,200,150,100);
    	btRun.setSize(30,30);
    	btExit.setBounds(200,200,150,100);
    	btExit.setSize(30,30);
    	btReset.setBounds(270,200,150,100);
    	btReset.setSize(40,30);
    	them.setBounds(340,200,150,100);
    	them.setSize(30,30);
        t.setSize(900, 800);
    }
    
    private void dangKy() {
          btExit.addActionListener(this);
          btRun.addActionListener(this);
          btReset.addActionListener(this);
          them.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
    	if(e.getSource()==this.btExit)
    		System.exit(0);
    	if(e.getSource()==this.btRun) {
    		dd.setVisible(true);
    		int a1,b1,c1,dt;
    		float x,x1,x2;
    		a1=Integer.parseInt(aa.getText());
    		b1=Integer.parseInt(bb.getText());
    		c1=Integer.parseInt(cc.getText());
    		dt=(b1*b1)-4*a1*c1;
    		if (a1 == 0) {
                if (b1 == 0) {
                	if(c1==0) {
                		this.dd.setText("Phương trình vô số nghiệm!");
                		}
                	else {
                		this.dd.setText("Phương trình vô nghiệm!");
                		}
                } 
                else {
                	x=(-c1/(float)b1);
                	this.dd.setText( "Phương trình có một nghiệm: " + "x = " + x);
                }
            }
    		else {
    		if (dt > 0) {
                x1 = (float) ((-b1 + Math.sqrt(dt)) / (2*a1));
                x2 = (float) ((-b1 - Math.sqrt(dt)) / (2*a1));
                this.dd.setText( "Phương trình có 2 nghiệm là: " + "x1 = " + x1 
                        + " và x2 = " + x2);
            } else if (dt == 0) {
                x1 = (-b1 / (2 * a1));
                this.dd.setText("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
            } else {
            	this.dd.setText( "Phương trình vô nghiệm!");
            }
    	}
    }
    	if(e.getSource()==btReset) {
    		dd.setVisible(false);
    		this.aa.setText("");
    		this.bb.setText("");
    		this.cc.setText("");
    	}
    	if(e.getSource()==them) {
    		dd.setVisible(true);
    		dd.setText("Nhấn mấy nút kia đi mấy cha nội!"+"\nRảnh quá");
    		}		
    	}
    /*public void actionPerformed(java.awt.event.MouseEvent f) {
    	
    }*/
    
    public static void main(String args[]) {
        new PTBTwo();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public static void main(String args[]) {
        new PTB2();
    }

}
}
