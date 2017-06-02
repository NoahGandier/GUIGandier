import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UIMainWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public UIMainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        testActors();
    }
    
    /**
     * testAcotors will add objects with on them to the world
     * @param There are no parameters
     * @return there is nothing returned
     */
    public void testActors()
    {
        addObject( new Button(20,"button-blue.png", "button-green.png", "press"), 550, 45 );
        addObject( new Label("hey Man", 25), 120, 300 );
        addObject( new TextBox("aye thats pretty good", 26, true, Color.BLUE, Color.RED),300, 50);
        addObject( new Menu("File", "new\nOpen\nSave\nClose\nExit", 30, Color.GREEN, Color.RED, Color.BLUE, Color.YELLOW, new FileCommands()), 41, 50 );
    }
}
