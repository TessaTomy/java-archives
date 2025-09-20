import java.awt.*;
import java.applet.*;

/*<applet code="face.class" height=800 width=1000>
</applet>*/

public class face extends Applet
{
	public void init()
	{
		setBackground(Color.GRAY);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.YELLOW);
		g.fillOval(100,100,300,400);
		g.fillOval(70,250,40,100);
		g.fillOval(390,250,40,100);	
		g.setColor(Color.WHITE);
		g.fillOval(170,250,40,30);
		g.fillOval(300,250,40,30);	
		g.setColor(Color.BLACK);
		g.fillOval(180,260,20,20);
		g.fillOval(310,260,20,20);
		g.drawLine(250,300,230,350);
		g.drawLine(230,350,265,350);
		g.drawLine(120,200,380,200);
		g.fillArc(120,100,260,200,0,180);
		g.setColor(Color.PINK);
		//g.fillArc(200,400,100,20,0,360);
		g.drawLine(200,400,300,400);
		g.fillArc(200,370,100,50,0,-180);
		
	}
}
