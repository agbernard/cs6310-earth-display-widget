package gui.widget.earth;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class EarthPanel extends JPanel {

  private static final long serialVersionUID = -1108120537851962997L;  
  private SunDisplay sunDisplay;
  private EarthGrid earth;
  
  public EarthPanel(Dimension minSize, Dimension maxSize, Dimension prefSize) {
    super();
    setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    setMinimumSize(minSize);
    setMaximumSize(maxSize);
    setPreferredSize(prefSize);
    
    earth = new EarthGrid();
    earth.setAlignmentX(Component.LEFT_ALIGNMENT);
        
    sunDisplay = new SunDisplay(earth.getWidth());
    sunDisplay.setAlignmentX(Component.LEFT_ALIGNMENT);
    
    add(sunDisplay);
    add(earth);
  }
  
  public void drawGrid(int degreeSeparation) {
    earth.setGridSize(degreeSeparation);
    sunDisplay.drawSunPath(earth.getWidth());
    repaint();
  }
  
  public int getRadius() {
    return earth.getRadius();
  }
      
  public void updateGrid(IGrid grid) {
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
