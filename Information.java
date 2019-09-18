import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Information here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Information extends World
{
    private GreenfootImage image1; //The two Putin images used for animation
    private GreenfootImage image2;
    private GreenfootImage image3; //The two Putin images used for animation
    private GreenfootImage image4;
    private GreenfootImage image5; //The two Putin images used for animation
    private GreenfootImage image6;
    private GreenfootImage image7; //The two Putin images used for animation
    private GreenfootImage image8;
    /**
     * Constructor for objects of class Information.
     * 
     */
    public Information()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        image1 = new GreenfootImage("Info Slides.jpg");
        image2 = new GreenfootImage("Info Slides (1).jpg");
        image3 = new GreenfootImage("Info Slides (2).jpg");
        image4 = new GreenfootImage("Info Slides (3).jpg");
        image5 = new GreenfootImage("Info Slides (4).jpg");
        image6 = new GreenfootImage("Info Slides (5).jpg");
        image7 = new GreenfootImage("Info Slides (6).jpg");
        image8 = new GreenfootImage("Info Slides (7).jpg");
        setBackground(image1);
        Greenfoot.delay(20);
        setBackground(image2);
        Greenfoot.delay(20);
        setBackground(image3);
        Greenfoot.delay(20);
        setBackground(image4);
        Greenfoot.delay(20);
        setBackground(image5);
        Greenfoot.delay(20);
        setBackground(image6);
        Greenfoot.delay(20);
        setBackground(image7);
        Greenfoot.delay(20);
        setBackground(image8);
        Greenfoot.delay(20);
        
        
        
    }
  }
