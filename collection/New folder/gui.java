import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javafx.application.Application.*;
public class gui{
	JFrame f;
	JPanel h;
	JPanel s;
	JPanel si;
	JButton b;
	JButton b3;
	JButton b2;
	JLabel lh;
	JLabel ls;
	JLabel lsc;
	JPanel ph;
	public static void main(String[] args){
		gui g=new gui();
		g.run();
	}
		public void run(){
		f=new JFrame("Welcome to Calculator");
		JPanel p=new JPanel();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		h=new home().go();
		lh=new JLabel("Welcome to Home");
		ls=new JLabel("Welcome to Simple Calculator");
		lsc=new JLabel("Welcome to Power Palculator");
		ph=new JPanel();
		ph.add(lh);
		ph.add(ls);
		ph.add(lsc);
		ls.setVisible(false);
		lsc.setVisible(false);
		f.getContentPane().add(BorderLayout.NORTH,ph);
		f.getContentPane().add(h);
		h.setVisible(true);
		b=new JButton("Simple Calculator");
		b.addActionListener(new simpl());
		b2=new JButton("Power Calculator");
		b2.addActionListener(new scien());
		b3=new JButton("Home");
		b3.addActionListener(new hom());
		b3.setVisible(false);
		f.getContentPane().add(BorderLayout.SOUTH,p);
		p.add(b);
		p.add(b2);
		p.add(b3);
		f.setSize(700,400);
		f.setVisible(true);
		s=new simple().go();
		si=new science().go();
		
		
		}
	public class simpl implements ActionListener{
		public void actionPerformed(ActionEvent e){
			f.getContentPane().add(s);
			b.setVisible(false);
			b2.setVisible(false);
			b3.setVisible(true);
			h.setVisible(false);
			s.setVisible(true);	
			si.setVisible(false);
			ls.setVisible(true);
			lsc.setVisible(false);
			lh.setVisible(false);
		}
	}
	public class scien implements ActionListener{
		public void actionPerformed(ActionEvent e){
			f.getContentPane().add(si);
			b2.setVisible(false);
			b.setVisible(false);
			b3.setVisible(true);
			s.setVisible(false);
			h.setVisible(false);
			si.setVisible(true);
			ls.setVisible(false);
			lsc.setVisible(true);
			lh.setVisible(false);
		}
	}
	public class hom implements ActionListener{
		public void actionPerformed(ActionEvent e){
			b.setVisible(true);
			b2.setVisible(true);
			b3.setVisible(false);
		h.setVisible(true);
		s.setVisible(false);
		si.setVisible(false);
		ls.setVisible(false);
			lsc.setVisible(false);
			lh.setVisible(true);
		}
	}
}