import javax.swing.*;
import java.awt.*;
class MyDrawPanel extends JPanel{
	public void paintComponent(Graphics g){
		g.fillRect(0,0,this.getWidth(),this .getHeight());
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		Color r=new Color(red,green,blue);
		g.setColor(r);
		g.fillOval(0,0,100,100);
	}
}