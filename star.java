/*
 * [initial-upload] Legacy applet rendering using embedded <applet> tag
 * [jdk-1.8] Compatible with appletviewer.exe; tested polygon rendering
 * [graphics] White star on black background using fillPolygon
 * [run-instructions] Compile with `javac star.java`, then run using `appletviewer star.java`
 * [notes] Embedded tag must be JavaDoc-style 
 */

import java.awt.*;
import java.applet.*;

public class star extends Applet
{
	public void init()
	{
		setBackground(Color.BLACK);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.WHITE);
		int x[]={50,200,250,300,450,350,400,250,100,150};
		int y[]={130,130,50,130,130,175,250,190,250,175};
		g.fillPolygon(x,y,10);
	}
}

/*<applet code="star.class" height=500 width=500>
</applet>*/
