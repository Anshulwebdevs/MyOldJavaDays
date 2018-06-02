import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

 public class a extends JFrame {
 public a(String text, String fontName) {
 super("Show Font");
 setSize(425, 150);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
aPanel sf = new aPanel(text, fontName);
 add(sf);
 setVisible(true);
 }

 public static void main(String[] arguments) {
 if (arguments.length < 1) {
 System.out.println("Usage: java a msg font");
 System.exit(-1);
 }
 a tf = new a(arguments[0], arguments[1]);
 }

 }

 class aPanel extends JPanel {
 String text;
 String fontName;

 public aPanel(String text, String fontName) {
 super();
 this.text = text;
 this.fontName = fontName;
 }

 public void paintComponent(Graphics comp) {
 super.paintComponent(comp);
 Graphics2D comp2D = (Graphics2D) comp;
 comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
 Font font = new Font(fontName, Font.BOLD, 18);
 FontMetrics metrics = getFontMetrics(font);
 comp2D.setFont(font);
 int x = (getSize().width - metrics.stringWidth(text)) / 2;
 int y = getSize().height / 2;
 comp2D.drawString(text, x, y);
 }
 }