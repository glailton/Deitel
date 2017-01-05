package cap23;

import java.applet.Applet;
import java.awt.Graphics;

public class WelcomeApplet extends Applet{
	public void paint (Graphics d){
		super.paint(d);
		
		d.drawString("Welcome Glailton", 25, 25);
	}
}
