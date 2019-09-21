import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

import java.awt.Graphics; //Necessary imports for Lee to work

/**
 * Lee actor - Player controls object Robert E Lee through WASD keys
 * 
 * @author Parth Joshi, Ethan Lau, Arav Vyawahare, Jonathan Wang
 * @version 2.0 Sept 20, 2019
 */
public class Lee extends Actor //Lee class
{
    public int ukrainesEaten; //Amount of "Territories" consumed 
    private GreenfootImage image1; 
    
    /**
     * Act - do whatever the Lee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment. Includes "lookForUkraine" and input from the keyboard for moving
     */
    public void act() 
    {
        lookForUkraine(); 
        checkKeyPress();
    }  
    
    /**
     * Constructor - sets up image of Lee object as Rober E Lee and sets up counter 
     * @param Counter pointCounter
     */
    public Lee(Counter pointCounter) 
    {
       Russia.scoreCounter = pointCounter; 
       image1 = new GreenfootImage("lee.jpg"); 
       setImage(image1);
       ukrainesEaten = 0; 
    }
    
    /**
     *  "canSee" method imported from the Actor class, necessary for eating territories
     *  @param Class clss
     */
    public boolean canSee(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
    
    /**
     *  "eat" method imported from the Actor class, necessary for eating territories
     *  @param Class clss
     */
    public void eat(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor); //Takes the Ukraine object out of the world
        }
    }
    
    /**
     * Allows the player to control object using the WASD keys
     */
    private void checkKeyPress() 
    {
        if (Greenfoot.isKeyDown("d"))
        {
            turn(6);
        }
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-6);
        }
        if (Greenfoot.isKeyDown("w"))
        {
            move(6);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            move(-6);
        }
    }
    
    /**
     * Method by which player finds and tears apart various territories, as well as gives points to the counter and stops the game. 
     */
    public void lookForUkraine() 
    {
        if ( canSee(Ukraine.class) ) 
        {
            eat(Ukraine.class); //Nom-nom
            Russia.scoreCounter.add(5);
            Russia.scoreCounter.updateImage();
            ukrainesEaten = ukrainesEaten + 1;
            if (ukrainesEaten >= 9) //scoreCounter.getValue() >= 40
            { 
                Greenfoot.playSound("Evil_laugh_Male_9-Himan-1598312646.mp3"); 
                getWorld().setBackground(new GreenfootImage("confedflag.png")); 
                Greenfoot.delay(200);
                getWorld().addObject(new Background_Information(), 0, 0);
                for (Object obj : getWorld().getObjects(null)) ((Actor)obj).getImage().setTransparency(0);
            }
        }
    }
}
