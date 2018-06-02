import javax.swing.*;
import java.awt.*;
public class draw{
	int i=0;
	int j=0;
	public static void main(String[] args){
		draw h=new draw();
		h.go();
	}
	public void go(){
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		drawg d=new drawg();
		//f.getContentPane().add(d);
		f.add(d);
		f.setSize(500,500);
		f.setVisible(true);
		for(int a=0;a<500;a++){
			i++;
			j++;
			d.repaint();
			try{
				Thread.sleep(50);
			}catch(Exception e){}
		}
	}
	
	public class drawg extends JPanel{
	public void paintComponent(Graphics g){
		Graphics2D g2= (Graphics2D) g;
		g2.setColor(Color.white);
		g2.fillRect(0,0,this.getWidth(),this.getHeight());
		g2.setColor(Color.orange);
		//int z=i*i;
		g2.fillRect(i,j,100,100);
			//g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
	}
}
}