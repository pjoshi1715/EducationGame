import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
                     // Necessary imports
/**
 * Grant actor - Player controls object Grant through arrow keys
 * 
 * @author Parth Joshi, Ethan Lau, Arav Vyawahare, Jonathan Wang
 * @version 2.0 Sept 20, 2019
 */
public class Grant extends Actor //Grant class
{
    public static int leeEaten; //Amount of Vladmir's eliminated from the world
    private GreenfootImage image3; //The two eagle images used for animation
    private int count = 0; //Used for image-switch timing purposes
    
    /**
     * This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment. Calls on checkKeyPress2() and lookForLee() methods. 
     */
    public void act() 
    {
        checkKeyPress2();
        lookForLee(); 
 
    }   
    
    /**
     * Constructer of Grant. Establishes image and leeEaten variable
     */
    public Grant() 
    {
       image3 = new GreenfootImage("grant.jpg"); 
       setImage(image3);
       leeEaten = 0; 
    }
    
    /**
     * "can see" method, needed for "eating" Lee
     * @param Class clss
     */
    private boolean canSee(Class clss)  
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
    
    /**
     *  imported from the actor class, the "eat" method for devouring Lee
     *  @param Class clss
     */
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }
    
    /**
     * Allows the player to control Grant using the arrow keys
     */
    public void checkKeyPress2() 
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-6); 
        }
        if (Greenfoot.isKeyDown("right"))
        {
           turn(6);
        }
        if (Greenfoot.isKeyDown("up"))
        {
           move(3);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            move(-3); 
        }
    }
    
    /**
     * Method by which player uses "canSee" and "eat" to destroy Lee. Stops game.
     */
    public void lookForLee() 
    {
        if ( canSee(Lee.class) ) 
        {
            eat(Lee.class);
            Greenfoot.playSound("hawk_screeching-Mike_Koenig-1626170357.wav"); 
            leeEaten = leeEaten + 1;
            if (leeEaten == 1 )
            {
                getWorld().setBackground(new GreenfootImage("flag2.png"));
                Greenfoot.delay(200);
                getWorld().addObject(new Background_Information(), 0, 0);
                for (Object obj : getWorld().getObjects(null)) ((Actor)obj).getImage().setTransparency(0);
            }
        }
    }
}
