import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class TextBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextBox extends Actor
{
    private GreenfootImage img;
    private boolean border = false;
    private int fontSize;
    private Color foreground;
    private Color background;
    
    public TextBox(String message, int fs, boolean b, Color fg, Color bg)
    {
        fontSize = fs;
        border = b;
        foreground = fg;
        background = bg;
        
        img = new GreenfootImage(message, fontSize, foreground, background);
        display();
    }
    
    public TextBox( String message)
    {
        img = new GreenfootImage(message, fontSize, foreground, background);
        display();
    }
    
    /**
     * display will set the image in the world if border is true
     * 
     * @param there are no parameters
     * @return Nothing is returned
     */
    public void display()
    {
        setImage(img);
        
        if( border == true)
        {
            img.setColor (Color.BLACK);
            img.drawRect(0, 0, img.getWidth()-1, img.getHeight()-1);
            setImage(img);
        }
    }
    
    /**
     * Act - do whatever the TextBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
