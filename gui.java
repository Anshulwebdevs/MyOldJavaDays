import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class gui{
	JTextArea ta;
	JTextField t;
	ArrayList <String> name;
	public static void main(String[] args){
		gui g=new gui();
		g.go();
	}
	public void go(){
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b=new JButton("click to add");
		b.addActionListener(new aradd());
		t=new JTextField(20);
		t.addActionListener(new tex());
		ta=new JTextArea(20,20);
		name=new ArrayList <String> ();
		f.add(BorderLayout.NORTH,t);
		f.add(BorderLayout.CENTER,ta);
		f.add(BorderLayout.SOUTH,b);
		f.setVisible(true);
		//f.setSize(400,400);
		f.setBounds(400,300,400,400);
	}
	public class aradd implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String w= new String(t.getText());
			name.add(w);
			//for(int i=0;i<1;i++){
			ta.setText(name+"");
			//}
		}
	}
	public class tex implements ActionListener{
		public void actionPerformed(ActionEvent e){
			t.allSelected();
		}
	}
	
}