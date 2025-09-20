import java.applet.*;
import java.awt.*;
/*<applet code="ball.java" height=400 width=500>
</applet>*/

public class ball extends Applet implements Runnable
{
	int x,y;
	public void init()
	{
		Thread t=new Thread(this);
		t.start();
		x=0;
		y=300;
	}
	public void paint(Graphics g)
	{
		g.fillOval(x,y,40,40);
	}
	public void run()
	{
		for(;;)
		{
			x=(x+10)%400;
			y=(y+100)%500;
			repaint();
			try
			{
				Thread.sleep(60);
			}
			catch(Exception e)
			{}
		}
	}
}
