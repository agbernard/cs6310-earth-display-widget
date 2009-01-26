package gui.widget.earth;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 * 
 * @author Andrew Bernard
 */
public class EarthPanel extends JPanel {

  private static final long serialVersionUID = -1108120537851962997L;  
  private SunDisplay sunDisplay;
  private EarthGridDisplay earth;
  
  public EarthPanel(Dimension minSize, Dimension maxSize, Dimension prefSize) {
    super();
    setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    setMinimumSize(minSize);
    setMaximumSize(maxSize);
    setPreferredSize(prefSize);
    
    earth = new EarthGridDisplay();
    earth.setAlignmentX(Component.LEFT_ALIGNMENT);
        
    sunDisplay = new SunDisplay(earth.getWidth());
    sunDisplay.setAlignmentX(Component.LEFT_ALIGNMENT);
    
    add(sunDisplay);
    add(earth);
  }
  
  /**
   * Draws the grid.
   * 
   * @param degreeSeparation the latitude and longitude degree separations 
   * between the cells in the grid
   */
  public void drawGrid(int degreeSeparation) {
    earth.setGranularity(degreeSeparation);
    sunDisplay.drawSunPath(earth.getWidth());
    repaint();
  }
  
  public int getRadius() {
    return earth.getRadius();
  }
      
  public void updateGrid(TemperatureGrid grid) {
    earth.updateGrid(grid);
  }
  
  public void moveSunPosition(float degrees) {
    sunDisplay.moveSunPosition(degrees);
    repaint();
  }
  
  public void reset() {
    sunDisplay.reset();
    earth.reset();
    repaint();
  }
  
  public void setMapOpacity(float value) {
    earth.setMapOpacity(value);
    repaint();
  }

}
