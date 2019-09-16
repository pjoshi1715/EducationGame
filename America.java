import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
                     // Necessary imports
public class America extends Actor //AMERICA class
{
    public static int putinsEaten; //Amount of Vladmir's eliminated from the world
    private GreenfootImage image3; //The two eagle images used for animation
    private GreenfootImage image4;
    private int count = 0; //Used for image-switch timing purposes
    
    public void act() //Act method. Includes inputs from the keyboard and "lookForPutin", explained later
    {
        checkKeyPress2();
        lookForPutin(); 
       // Russia.backgroundMusic.playLoop();
    }   
    public void stopMusic2() //Used to stop the background "tetris" music once America eats Putin
    {
            if (putinsEaten == 1 )
            {
                Russia.backgroundMusic.stop(); 
            }
    }
    
   public America() //Constructor. Establishes the 2 eagle images and the sets the putinsEaten variable
   {
       
       image3 = new GreenfootImage("grant.jpg"); 
       image4 = new GreenfootImage("eagle2.jpg");
       setImage(image3);
       putinsEaten = 0; 
    }
   private boolean canSee(Class clss)  //"can see" method, needed for "eating" Putin
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
    public void eat(Class clss) //imported from the actor class, the "eat" method for devouring Putins
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }
    public void checkKeyPress2() //Allows the player to control America using the arrow keys
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
           move(4);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            move(-4); 
        }
    }
   public void lookForPutin() //Using the "canSee" and "eat" methods to destroy Putin. Also stops the game. 
    {
        if ( canSee(Putin.class) ) 
        {
            eat(Putin.class);
            Greenfoot.playSound("hawk_screeching-Mike_Koenig-1626170357.wav"); 
            putinsEaten = putinsEaten + 1;
            if (putinsEaten == 1 )
            {
                Russia.backgroundMusic.stop(); 
                getWorld().setBackground(new GreenfootImage("flag2.png")); 
//                 Russia.addObject(new Flag2(), 500, 300); //Future additons....
                Greenfoot.playSound("Village_People_-_YMCA.mp3"); //AMERICA'S true national anthem
                Greenfoot.stop();
            }
        }
    }
}
