import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class simple{
	JTextField t;
	JTextField t2;
	JTextField t3;
	JButton b;
	JButton b2;
	JLabel l3;
	JButton b3;
	JButton b4;
	JButton b5;
	public JPanel go(){
		JPanel p=new JPanel();
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel pr=new JPanel();
		p.add(p2);
		p.add(p3);
		p.add(pr);
		JLabel l=new JLabel("Enter First Number");
		JLabel l2=new JLabel("Enter Second Number");
		b=new JButton("Add");
		l3=new JLabel("Result = ");
		b.addActionListener(new add());
		b2=new JButton("Substract");
		b2.addActionListener(new sub());
		b3=new JButton("Multiply");
		b3.addActionListener(new mul());
		b4=new JButton("Divide");
		b4.addActionListener(new div());
		b5=new JButton("Clear");
		b5.addActionListener(new clear());
		t=new JTextField(10);
		t2= new JTextField(10);
		t3= new JTextField(20);
		p2.add(l);
		p2.add(t);
		p2.add(l2);
		p2.add(t2);
		pr.add(l3);
		p3.add(b);
		pr.add(t3);
		p3.add(b2);
		p3.add(b3);
		p3.add(b4);
		p3.add(b5);
		return p;
	} 
	public class add implements ActionListener{
		public void actionPerformed(ActionEvent a){
			try{double i=Double.parseDouble(t.getText());
			double j=Double.parseDouble(t2.getText());
			double z=i+j;
			t3.setText(""+z);}
			catch(Exception e){
				t3.setText("Invalid Number");
			}
		}
	}
	public class sub implements ActionListener{
		public void actionPerformed(ActionEvent a){
			try{double i=Double.parseDouble(t.getText());
			double j=Double.parseDouble(t2.getText());
			double z=i-j;
			t3.setText(""+z);}
			catch(Exception e){
				t3.setText("Invalid Number");
			}
		}
	}
	public class mul implements ActionListener{
		public void actionPerformed(ActionEvent a){
			try{double i=Double.parseDouble(t.getText());
			double j=Double.parseDouble(t2.getText());
			double z=i*j;
			t3.setText(""+z);}
			catch(Exception e){
				t3.setText("Invalid Number");
			}
		}
	}
	public class div implements ActionListener{
		public void actionPerformed(ActionEvent a){
			try{double i=Double.parseDouble(t.getText());
			double j=Double.parseDouble(t2.getText());
			double z=i/j;
			t3.setText(""+z);}
			catch(Exception e){
				t3.setText("Invalid Number");
			}
		}
	}
	
	public class clear implements ActionListener{
		public void actionPerformed(ActionEvent a){
			t.setText("");
			t2.setText("");
			t3.setText("");
		}
	}
}