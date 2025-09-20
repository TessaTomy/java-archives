/*
 * [initial-upload] Legacy applet for image rendering via getImage and getCodeBase
 * [class] ImageRenderApplet extends Applet; displays external image
 * [graphics] Loads image file and renders using drawImage
 * [jdk-1.8] Compatible with appletviewer.exe; image must be accessible via codebase
 * [run-instructions] Compile with `javac ImageRenderApplet.java`, run using `appletviewer ImageRenderApplet.java`
 * [placeholder] Image file used for testing; replace with final asset later
 */

import java.awt.*;
import java.applet.*;

public class ImageRenderApplet extends Applet {
    Image i;

    public void init() {
        i = getImage(getCodeBase(), "test.png");
    }

    public void paint(Graphics g) {
        g.drawImage(i, 0, 0, this);
    }
}

/**
<applet code="ImageRenderApplet.class" width="500" height="500">
</applet>
*/
