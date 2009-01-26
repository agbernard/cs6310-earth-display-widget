package gui.widget.earth;

import java.awt.Color;

public class TemperatureColorPicker {
	
	private Color colorPicker(int v) {
    int b = 0;
		int g = 0;
		int r = 0;

		if (v <= -100) {
			b = 170;
			g = 100;
			r = 170;
		}
		else if (v <= -46) {
			v = -1 * v;
			b = 255;
			g = 145 - (v * 10) % 115;
			r = 255;
		}
		else if (v <= -23 && v > -46) {
			v = -1 * v;
			b = 255;
			g = 145;
			r = 145 + (v * 5) % 115;
		}
		else if (v < 0 && v > -23) {
			v = -1 * v;
			b = 255;
			g = 145;
			r = 145 - (v * 5);
		}
		else if (v == 0) {
			b = 225;
			g = 145;
			r = 145;
		}
		else if (v > 0 && v < 23) {
			b = 255;
			g = 145 + (v * 5);
			r = 145;
		}
		else if (v >= 23 && v < 46) {

			b = 255 - (v * 5) % 115;
			g = 255;
			r = 145;
		}
		else if (v >= 46 && v < 69) {
			b = 145;
			g = 255;
			r = 145 + (v * 5) % 115;
		}
		else if (v >= 69 && v < 92) {
			b = 145;
			g = 255 - (v * 5) % 115;
			r = 255;
		}
		else {
			b = 145 - (v * 10) % 115;
			g = 145 - (v * 10) % 115;
			r = 255;
		}
		
		return new Color(r, g, b);
  }
	
}
