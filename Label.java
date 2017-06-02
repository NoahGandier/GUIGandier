import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
    
    private String value;
    private int fontSize;
    private Color lineColor = Color.BLACK;
    private Color fillColor = Color.WHITE;
    
    
    
    
    private final Color TRANSPARENT = new Color(0, 0, 0, 0);
    
    public Label(String v, int fs)
    {
        value = v;
        fontSize = fs;
        
        updateImage();
    }
    
    /**
     * testAcotors will add objects with on them to the world
     * @param There are no parameters
     * @return there is nothing returned
     */
    public Label(int v, int fs)
    {
        this(Integer.toString(v), fs );
    }
    
    /**
     * setValue will set Value to a
     * @param There are no parameters
     * @return there is nothing returned
     */
    public void setValue(String newValue)
    {
        value = newValue;
        updateImage();
    }
    
    /**
     * testAcotors will add objects with on them to the world
     * @param There are no parameters
     * @return there is nothing returned
     */ 
    public void setfILLColor(Color newColor)
    {
        fillColor = newColor;
        updateImage();
    }
    
    /**
     * setValue will set Value to a new int and updates image
     * 
     * @param newValue is a new int that will be shown by the value
     * @return nothing is returned
     */
    public void setValue(int newValue)
    {
        updateImage();
        value = Integer.toString(newValue);
    }
    
    /**
     * setlineColor will set lineColor to a new Color and updates image
     * 
     * @param there are no parameters
     * @return nothing is returned
     */
    public void setlineColor(Color newColor)
    {
        lineColor = newColor;
        updateImage();
    }
    
    /**
     * updateImage updates the image
     * 
     * @param there are no parameters
     * @return nothing is returned
     */
    private void updateImage()
    {
        setImage( new GreenfootImage(value, fontSize, fillColor, TRANSPARENT, lineColor) );
    }
    
    /**
     * Act - do whatever the Label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
