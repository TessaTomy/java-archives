import java.awt.*;
import java.applet.*;

/*
<applet code="flag.class" height=700 width=700>
    <param name="hi" value="10">
</applet>
*/

public class flag extends Applet {
    public void init() {
        //setBackground(Color.);
    }

    public void paint(Graphics g) {
        // Draw flag stripes
        g.setColor(Color.ORANGE);
        g.fillRect(100,100,500,100);

        g.setColor(Color.WHITE);
        g.fillRect(100,200,500,100);
        
        g.setColor(Color.GREEN);
        g.fillRect(100,300,500,100);

        g.setColor(Color.BLACK);
        g.drawLine(100,100,100,700);
        // Draw the Ashoka Chakra
        g.setColor(Color.BLUE);
	g.drawOval(300,200,100,100);
        int x=350;
	int y=250;
	int angle=50;
	for(int i=0;i<24;i++)
	{
		double next=Math.toRadians((360/24)*i);
		int nextx=x+(int) (angle*Math.cos(next));
		int nexty=y+(int) (angle*Math.sin(next));
		g.drawLine(x,y,nextx,nexty);

	}
    }
}
