import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class gui{
	JTextField t;
	JTextField t2;
	public static void main(String[] args){
		gui g= new gui();
		g.go();
	}
	public void go(){
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b=new JButton("click to square the number");
		JButton b2=new JButton("double");
		t=new JTextField();
		t2=new JTextField();
		f.getContentPane().add(BorderLayout.SOUTH,b);
		f.getContentPane().add(BorderLayout.EAST,b2);
		f.getContentPane().add(BorderLayout.NORTH,t);
		f.getContentPane().add(BorderLayout.CENTER,t2);
		b.addActionListener(new square());
		b2.addActionListener(new doubl());
		f.setSize(500,500);
		f.setVisible(true);
		}
		public class doubl implements ActionListener{
			public void actionPerformed(ActionEvent e){
				int i=Integer.parseInt(t.getText());
				t2.setText(""+2*i);
			}
		}
		public class square implements ActionListener{
			public void actionPerformed(ActionEvent e){
				int i=Integer.parseInt(t.getText());
				t2.setText(""+i*i);
			}
		}
}