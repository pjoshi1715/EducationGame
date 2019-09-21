import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
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
    
    /**
     * 
     */
    public void Slideshow() 
    {
       getWorld().setBackground(new GreenfootImage("Time_For_Info.jpg"));
       Greenfoot.delay(200);
       SlideshowR(1);
       getWorld().setBackground(new GreenfootImage("The_End.jpg"));
       Greenfoot.stop();
    }    
    
    public void SlideshowR(int n)
  {
      if (n <= 8) {
        getWorld().setBackground(new GreenfootImage("Info Slides (" + n + ").jpg"));
        Greenfoot.delay(600);  
        SlideshowR(n + 1);
    }
  }
}
