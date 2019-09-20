import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BullRun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background_Information extends Actor
{
    /**
     * Act - do whatever the BullRun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        Slideshow();
    }
    
    public void Slideshow() 
    {
       getWorld().setBackground(new GreenfootImage("Time_For_Info.jpg"));
       Greenfoot.delay(200);
       getWorld().setBackground(new GreenfootImage("Info Slides (1).jpg"));
       Greenfoot.delay(600);
       getWorld().setBackground(new GreenfootImage("Info Slides (8).jpg"));
       Greenfoot.delay(600);
       getWorld().setBackground(new GreenfootImage("Info Slides (3).jpg"));
       Greenfoot.delay(600);
       getWorld().setBackground(new GreenfootImage("Info Slides (4).jpg"));
       Greenfoot.delay(600);
       getWorld().setBackground(new GreenfootImage("Info Slides (5).jpg"));
       Greenfoot.delay(600);
       getWorld().setBackground(new GreenfootImage("Info Slides (6).jpg"));
       Greenfoot.delay(600);
       getWorld().setBackground(new GreenfootImage("Info Slides (7).jpg"));
       Greenfoot.delay(600);
       getWorld().setBackground(new GreenfootImage("Info Slides (2).jpg"));
       Greenfoot.delay(600);
       getWorld().setBackground(new GreenfootImage("The_End.jpg"));
       Greenfoot.stop();
    }    
}
