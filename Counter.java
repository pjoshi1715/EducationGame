//Imported from the available Greenfoot classes
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.awt.Graphics;  //Necessary imports for the counter to work

public class Counter extends Actor //This is the oh-so-important ACTOR class
{
    private static final Color transparent = new Color(0,0,0,0); //
    private GreenfootImage background; //Background image for the counter
    private int value; 
    private int target;
    private String prefix;
    
    public Counter() //Constructor for String method
    {
        this(new String());
    }

    /**
     * Create a new counter, initialised to 0.
     */
    public Counter(String prefix)
    {
        background = getImage();  // get image from class
        value = 0;
        target = 0;
        this.prefix = prefix;
        updateImage();
    }
    
    /**
     * Animate the display to count up (or down) to the current target value.
     */
    public void act() //Act method for the counter, for specifically making sure the updated counter image is the correct value
    {
        if (value < target) {
            value++;
            updateImage();
        }
        else if (value > target) {
            value--;
            updateImage();
        }
    }

    /**
     * Add a new score to the current counter value.  This will animate
     * the counter over consecutive frames until it reaches the new value.
     */
    public void add(int score) //Adds to the counter score whenever Putin eats a Ukraine
    {
        target += score;
    }

    /**
     * Return the current counter value.
     */
    public int getValue() //Used in the Putin class for retreiving the current score
    {
        return target;
    }

    /**
     * Set a new counter value.  This will not animate the counter.
     */
    public void setValue(int newValue) //Used for setting a new counter value
    {
        target = newValue;
        value = newValue;
        updateImage();
    }
    
//     /**
//      * Sets a text prefix that should be displayed before
//      * the counter value (e.g. "Score: ").
//      */
//     public void setPrefix(String prefix)
//     {
//         this.prefix = prefix;
//         updateImage();
//     }

    /**
     * Update the image on screen to show the current value.
     */
    public void updateImage()  //Specific artsy things for updating the counter image
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage(prefix + value, 22, Color.BLACK, transparent);
        
        if (text.getWidth() > image.getWidth() - 20)
        {
            image.scale(text.getWidth() + 20, image.getHeight());
        }
        
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}
