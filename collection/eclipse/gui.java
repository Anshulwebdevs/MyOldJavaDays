import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class gui{
	
	public static void main(String[] args){
		gui g=new gui();
		g.go();
	}
	public void go(){
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dra d=new dra();
		f.getContentPane().add(d);
		f.setSize(500,500);
		f.setVisible(true);
	}
	public class dra extends JPanel{
		public void paintComponent(Graphics g){
			g.fillRect(0,0,this.getWidth(),this.getHeight());
			g.setColor(Color.yellow);
			g.fillOval(100,100,200,200);
			g.setColor(Color.red);
			g.fillOval(100,100,50,50);
		}
	}
	
}