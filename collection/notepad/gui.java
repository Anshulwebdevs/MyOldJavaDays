import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
public class gui{
	JTextArea t;
	JFrame f;
	public static void main(String[] args){
		try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            }catch (Exception ex) {} 
		gui g=new gui();
		g.go();
	}
	public void go(){
		f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar m=new JMenuBar();
		JMenu file=new JMenu("File      ");
		JMenuItem save=new JMenuItem("save    ");
		JMenuItem local=new JMenuItem("location");
		file.add(save);
		file.add(local);
		local.addActionListener(new loc());
		save.addActionListener(new sav());
		//save.setFont(ff);
		//local.setFont(ff);
		m.add(file);
		t=new JTextArea();
		Font ff=new Font("Constantia",Font.BOLD,24);
		t.setFont(ff);
		//file.setFont(ff);
		JScrollPane s=new JScrollPane(t);
		//JPanel p=new JPanel();
		//p.add(s);
		t.setLineWrap(true);
		//s.setVerticalScrol1BarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		//s.setHorizonta1Scrol1BarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		f.setJMenuBar(m);
		f.getContentPane().add(s);
		f.setSize(1400,700);
		f.setVisible(true);
	} 
	public class sav implements ActionListener{
		public void actionPerformed(ActionEvent eq){
			try{
			FileWriter writer=new FileWriter("foo.txt");
			writer.write("hello, this is written on the file");
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
			try{
				String s=t.getText();
			FileWriter writer=new FileWriter("foo.txt");
			writer.write(""+s);
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		}
	}
	public class loc implements ActionListener{
		public void actionPerformed(ActionEvent w){
			JFileChooser j=new JFileChooser();
			j.showSaveDialog(f);
			saveFile(j.getSelectedFile());
		}
	}
	public void saveFile(File file){
		try{
				String s=t.getText();
			BufferedWriter writer=new BufferedWriter(new FileWriter(file));
			writer.write(""+s);
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
