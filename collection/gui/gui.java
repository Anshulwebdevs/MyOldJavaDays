import javax.swing.*;
import java.awt.event.*;
public class gui implements ActionListener{
	JButton b;
	public static void main(String[]args){
		gui g=new gui();
		g.go();
		}
		public void go(){
		JFrame f=new JFrame();
		b=new JButton("click me");
		f.getContentPane().add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,300);
		f.setVisible(true);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent event){
		b.setText("you pressed button");
	}
}