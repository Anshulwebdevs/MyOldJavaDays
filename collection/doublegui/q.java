import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class q implements ActionListener{
	JTextField t;
	JTextField t2;
	public static void main(String[] args){
		q g=new q();
		g.go();
	}
	void go(){
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b=new JButton("hello");
		b.addActionListener(this);
		t=new JTextField();
		t2=new JTextField();
		f.getContentPane().add(BorderLayout.SOUTH,b);
		f.getContentPane().add(BorderLayout.NORTH,t);
		f.getContentPane().add(BorderLayout.CENTER,t2);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		int i=Integer.parseInt(t.getText());
		t2.setText(""+2*i);
		
	}
}