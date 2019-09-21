import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class TitleScreen here.
 * 
 * @author Parth Joshi, Ethan Lau, Arav Vyawahare, Jonathan Wang
 * @version 2.0 Sept 20, 2019
 */
public class TitleScreen extends World
{
 
    /**
     * Constructor for the TitleScreen class. Default World Constructer 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1); 
        Greenfoot.start();
    }
    
    /**
     * This method is called whenever the 'Act' or 'Run' button gets pressed in the environment. Checks if space has been pressed and switches worlds once pressed. 
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("space")) Greenfoot.setWorld(new Russia());
    }
}