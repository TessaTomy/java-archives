import java.applet.*;
import java.awt.*;

/*<applet code="kite.class" width=500 height=600>
</applet>*/

public class kite extends Applet
{
	public void paint(Graphics g)
	{	
		g.drawLine(100,100,100,400);
		g.drawLine(0,200,200,200);
		g.setColor(Color.RED);
		int a[]={0,100,100};
		int b[]={200,100,200};
		g.fillPolygon(a,b,3);
		int c[]={100,100,200};
		int d[]={200,400,200};
		g.fillPolygon(c,d,3);
		g.drawLine(100,400,115,450);
		g.drawLine(100,400,85,450);

		g.setColor(Color.PINK);
		int x[]={100,100,200};
		int y[]={100,200,200};
		g.fillPolygon(x,y,3);
		int z[]={0,100,100};
		int w[]={200,200,400};
		g.fillPolygon(z,w,3);
		
		g.setColor(Color.BLACK);
		
		g.drawLine(100,400,300,700);
	}
}
