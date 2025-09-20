/*
 * [initial-upload] Legacy applet rendering using embedded <applet> tag
 * [jdk-1.8] Compatible with appletviewer.exe; tested smiley face rendering
 * [graphics] Yellow face with eyes and arc smile using fillOval and fillArc
 * [run-instructions] Compile with `javac smile.java`, then run using `appletviewer smile.java`
 * [notes] Embedded tag must be JavaDoc-style and placed above class declaration
 */

import java.applet.*;
import java.awt.*;

/*<applet code="smile.java" width="300" height="600">
</applet>*/

public class smile extends Applet
{
	public void init()
	{
		setBackground(Color.BLACK);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.YELLOW);
		g.fillOval(200,200,200,200);
		g.setColor(Color.BLACK);
		g.fillOval(240,260,20,20);
		g.setColor(Color.BLACK);
		g.fillOval(340,260,20,20);
		g.setColor(Color.WHITE);
		g.fillArc(250,266,100,100,0,-180);
	}
}
