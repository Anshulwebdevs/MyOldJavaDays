import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class gui{
	JTextField t;
	PrintWriter w;
	Socket s;
	public void go(){
		JFrame f=new JFrame("Networking");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p=new JPanel();
		t=new JTextField(20);
		JButton b=new JButton("send");
		b.addActionListener(new sendb());
		p.add(t);
		p.add(b);
		f.getContentPane().add(p);
		sendn();
		f.setSize(400,300);
		f.setVisible(true);
	}
	public void sendn(){
		try{
			s=new Socket("127.0.0.1",1500);
			w=new PrintWriter(s.getOutputStream());
			System.out.println("setting up network");
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public class sendb implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			try{
				w.println(t.getText());
				w.flush();
			}catch(Exception ex){
				ex.printStackTrace();
			}
			t.setText("");
			t.requestFocus();
		}
	}
	public static void main(String[] args){
		gui g=new gui();
		g.go();
	}
}