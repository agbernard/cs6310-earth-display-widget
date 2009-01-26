package gui.widget.earth;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * 
 * @author Andrew Bernard
 */
public class EarthImage {
	private URL imgURL = this.getClass().getResource("earth-800x400.jpg");
	
	public EarthImage() {
		imgURL = this.getClass().getResource("earth-800x400.jpg");
	}
	
	public BufferedImage getBufferedImage() {
		BufferedImage earthImage = null;
		try {
      earthImage = ImageIO.read(imgURL);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    return earthImage;
	}
}
