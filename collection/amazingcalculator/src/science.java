import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class science{
	JTextField t;
	JTextField t2;
	JTextField t3;
	JButton b;
	JButton b2;
	public JPanel go(){
		JPanel p=new JPanel();
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		JPanel p2=new JPanel();
		p.add(p2);
		JPanel p3=new JPanel();
		p.add(p3);
		b=new JButton("Calculate Power");
		b.addActionListener(new po());
		b2=new JButton("Clear");
		b2.addActionListener(new clear());
		JLabel l=new JLabel("Enter number : ");
		JLabel l2=new JLabel("Enter Power to Calculate : ");
		JLabel l3=new JLabel("Result = ");
		t=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(20);
		//JLabel l=new JLabel("Power Calculator");
		JPanel pr=new JPanel();
		p.add(pr);
		p2.add(l);
		p2.add(t);
		p2.add(l2);
		p2.add(t2);
		pr.add(l3);
		pr.add(t3);
		p3.add(b);
		p3.add(b2);
		return p;
	} 
	public class po implements ActionListener{
		public void actionPerformed(ActionEvent ab){
			try{
			double a=Double.parseDouble(t.getText());
			double n=Double.parseDouble(t2.getText());
			double b=Math.pow(a,n);
			
			//double d=a;
			t3.setText(""+b);}
			catch(Exception ee){
				t3.setText("Invalid Number");
			}
			
		}
	}
	public class clear implements ActionListener{
		public void actionPerformed(ActionEvent ab){
			t.setText("");
			t2.setText("");
			t3.setText("");
		}
	}
}
