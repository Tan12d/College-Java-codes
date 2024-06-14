import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings({ "serial", "unused" })
public class graphics extends JPanel
{
	private Point lastPoint;
	
	public graphics()
	{
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				lastPoint = new Point(e.getX(),e.getY());
			}			
		});
		
		addMouseMotionListener( new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e)
			{
				Graphics g=getGraphics();
				g.draw3DRect(lastPoint.x,lastPoint.y,e.getX(),e.getY(), getAutoscrolls());
				g.dispose();
			}
		});
		
	}
	
	public static void main(String[] args) 
	{
		JFrame frame=new JFrame("Great Graphics Program");
		frame.getContentPane().add(new graphics(),BorderLayout.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.setVisible(true);
		

	}

}
