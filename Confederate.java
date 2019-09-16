import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.awt.Graphics; //Necessary imports for Putin to work
public class Putin extends Actor //PUTIN class
{
    public int ukrainesEaten; //Amount of innocent Ukraines devoured
    private GreenfootImage image1; //The two Putin images used for animation
    private GreenfootImage image2;
    private int count = 0; //Used for image-switch timing purposes
    public void act() //Act method for Putin, includes "lookForUkraine" and input from the keyboard for moving
    {
        lookForUkraine(); 
        checkKeyPress();
    }  
   public Putin(Counter pointCounter) //Switches Putin's image and relates Putin TO the counter (scoreCounter)
   {
       Russia.scoreCounter = pointCounter; 
       image1 = new GreenfootImage("putin.jpg"); 
       image2 = new GreenfootImage("putin2.gif");
       setImage(image1);
       ukrainesEaten = 0; 
   }
    public boolean canSee(Class clss) //"canSee" method imported from the Actor class, necessary for eating Ukraines
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
    public void eat(Class clss) //"eat" method imported from the Actor class, necessary for devouring Ukraines
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor); //Takes the Ukraine object out of the world
        }
    }
    private void checkKeyPress() //Allows the player to control Putin using the proper keys
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
   public void lookForUkraine() //Method by which Putin finds and tears apart various Ukraines, as well as gives points to the counter and stops the game. 
    {
        if ( canSee(Ukraine.class) ) 
        {
            eat(Ukraine.class); //Nom-nom
            Russia.scoreCounter.add(5);
            Russia.scoreCounter.updateImage();
            ukrainesEaten = ukrainesEaten + 1;
            if (ukrainesEaten >= 8) //scoreCounter.getValue() >= 40
            { 
                Russia.backgroundMusic.stop(); 
                getWorld().setBackground(new GreenfootImage("flag.png")); 
//              Russia.addObject(new Flag(), 500, 300); //Future additions....
                Greenfoot.stop(); 
                Greenfoot.playSound("СССР_-_Soviet_National_Anthem.mp3"); 
            }
        }
    }
}
