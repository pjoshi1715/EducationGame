import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
  //Necessary imports

public class Russia extends World  //RUSSIA, the world class here
{
    public static Counter scoreCounter; //Our counter this evening is named "scoreCounter"
    public static GreenfootSound backgroundMusic = new GreenfootSound("Nintendo_Music_-_Tetris_Gameboy_Main_Theme.mp3"); //Fun, fitting background music
    public Russia()
    {    
        super(1000, 700, 1);  // Create a new world with 1000 x 700 dimensions
        populateWorld();   //Method below, puts objects into the world at reset
        backgroundMusic.playLoop(); //plays the background Tetris music until stop
    }
    
    public void populateWorld()  //Method used to put new object into the world at reset of the game
    {
        Counter scoreCounter = new Counter(); //Establishes the new counter called "scoreCounter"
        addObject(scoreCounter, 50, 20); //Where the counter will be located
        Putin putin2 = new Putin(scoreCounter); //Creates a Putin object to relate to the counter
        
        addObject(new Putin(scoreCounter), 100, 620); //puts a single "Putin" into the world originally
        
        
        addObject(new Ukraine(), 290, 70);  //putting "Ukraines" into the world upon resetting at various locations
        addObject(new Ukraine(), 100, 500); 
        addObject(new Ukraine(), 360, 500); 
        addObject(new Ukraine(), 700, 400);
        addObject(new Ukraine(), 900, 56);
        addObject(new Ukraine(), 850, 600);
        addObject(new Ukraine(), 640, 300);
        addObject(new Ukraine(), 100, 900);
        
        addObject(new America(), 830, 200);  //puts a single "America" into the world originally
    }
   
 }
