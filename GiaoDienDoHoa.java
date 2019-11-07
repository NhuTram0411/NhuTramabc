package giaodiendohoa;

import java.awt.*;

public class GiaoDienDoHoa  {

    public static void main(String[] args) {
        Frame f = new Frame("Chao");
        Label l = new Label("Xin Chao");
        Font fo = new Font("Times New Roman", Font.BOLD, 24);
        Button bt = new Button("Exit");
        xlsk x = new xlsk();
        bt.addActionListener(x);
        f.add(bt);
        l.setFont(fo);
        l.setForeground(Color.GREEN);
        f.add(l);
        f.setSize(300, 200);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

}
