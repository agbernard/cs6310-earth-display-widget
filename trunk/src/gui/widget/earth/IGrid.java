package gui.widget.earth;

public interface IGrid {
  
  /**
   * Gets the temperature in the cell specified by 
   * the x and y coordinates
   */
  public double getTemperature(int x, int y);
  
  /**
   * Gets the height of the cell at the specified coordinates
   */
  public float getCellHeight(int x, int y);
  
  public int getWidth();
  
  public int getHeight();
    
  public long getTime();
  
  public IGrid copy();
  
  public int getGridSpacing();
}
