import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Backgroun_Information object Iterates through the informational slides.
 * 
 * @author Parth Joshi, Ethan Lau, Arav Vyawahare, Jonathan Wang
 * @version 2.0 Sept 20, 2019
 */
public class Background_Information extends Actor
{
  /**
   * Act - do whatever the BullRun wants to do. This method is called whenever
   * the 'Act' or 'Run' button gets pressed in the environment. Calls upon Slideshow
   */
  public void act(){
        Slideshow();
  }
    
  /**
  *  Slideshow sets background of the world to that of the Beginning Slide, the End slide, and calls for the SlideshowR method
  */
  public void Slideshow() {
       getWorld().setBackground(new GreenfootImage("Time_For_Info.jpg"));
       Greenfoot.delay(200);
       SlideshowR(1);
       getWorld().setBackground(new GreenfootImage("The_End.jpg"));
       Greenfoot.stop();
  }    
  
  /**
   * Recursive method in which slides 1 through 8 are ierated through. 
   */
  public void SlideshowR(int n)
  {
      if (n <= 8) {
        getWorld().setBackground(new GreenfootImage("Info Slides (" + n + ").jpg"));
        Greenfoot.delay(600);  
        SlideshowR(n + 1);
    }
  }
}
