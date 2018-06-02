import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class gui{
	JPanel p;
	JPanel p2;
	JButton b;
	JButton b2;
	JFrame f;
	public static void main(String[] args){
		gui g=new gui();
		g.go();
	}
	public void go(){
		f= new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p=new JPanel();
		p2=new JPanel();
		b=new JButton("first window");
		b2=new JButton("second window");
		b.addActionListener(new win());
		b2.addActionListener(new win2());
		JLabel l=new JLabel("first window");
		JLabel l2=new JLabel("second window");
		p.add(l);
		p2.add(l2);
		p2.add(b2);
		f.getContentPane().add(BorderLayout.SOUTH,b);
		f.getContentPane().add(BorderLayout.CENTER,p);
		//f.getContentPane().add(BorderLayout.CENTER,p2);
		p.setVisible(true);
		p2.setVisible(false);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public class win implements ActionListener{
		public void actionPerformed(ActionEvent a){
			f.getContentPane().add(BorderLayout.CENTER,p2);
			p.setVisible(false);
			p2.setVisible(true);
		}
	}
	public class win2 implements ActionListener{
		public void actionPerformed(ActionEvent a){
			//f.getContentPane().add(BorderLayout.CENTER,p2);
			p2.setVisible(false);
			p.setVisible(true);
		}
	}
}
