import java.applet.*;
import java.awt.*;

/*<applet code="cat.java" width="300" height="600">
</applet>*/

public class cat extends Applet
{
	public void init()
	{
		setBackground(Color.WHITE);
	}
	public void paint(Graphics g)
	{
		int x[]={100,110,130};
		int y[]={100,120,110};
		g.drawPolygon(x,y,3);
		int m[]={200,190,170};
		int n[]={100,120,110};
		g.drawPolygon(m,n,3);
		g.drawOval(100,200,100,200);
		g.drawOval(100,100,100,100);
		//eyes
		g.drawOval(120,130,10,10);
		g.drawOval(170,130,10,10);
		int a[]={140,150,160};
		int b[]={150,160,150};
		g.drawPolygon(a,b,3);
		g.drawLine(140,150,80,160);
		g.drawLine(140,154,90,164);
		g.drawLine(140,158,100,168);
		g.drawLine(160,150,220,160);
		g.drawLine(160,154,230,164);
		g.drawLine(160,158,240,168);
		int a1[]={140,150,160};
		int b2[]={165,175,165};
		g.drawPolygon(a1,b2,3);
		g.drawArc(170,300,250,100,0,-190);

	}
}
