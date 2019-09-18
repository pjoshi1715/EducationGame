import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.lang.Math;
  //Necessary imports

public class Russia extends World  //RUSSIA, the world class here
{
    public static Counter scoreCounter; //Our counter this evening is named "scoreCounter"
    private boolean musicStart = true;
    public static GreenfootSound backgroundMusic = new GreenfootSound("civilwartheme.mp3"); //Fun, fitting background music
    int [][] randpop = new int[9][2];
    
    public Russia()
    {    
        super(1000, 700, 1);  // Create a new world with 1000 x 700 dimensions
        populateWorld();   //Method below, puts objects into the world at reset
        backgroundMusic.playLoop(); //plays the background Tetris music until stop
        backgroundMusic.setVolume(25);
        
   }
    public void populateWorld()  //Method used to put new object into the world at reset of the game
    {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c <2;c++) {
                randpop[r][c] = (int)(Math.random()*1000);
            }
        }
        Counter scoreCounter = new Counter(); //Establishes the new counter called "scoreCounter"
        addObject(scoreCounter, 50, 20); //Where the counter will be located
        Putin putin2 = new Putin(scoreCounter); //Creates a Putin object to relate to the counter
        
        addObject(new Putin(scoreCounter), 100, 620); //puts a single "Putin" into the world originally
        

        addObject(new FortSumter(),randpop[0][0], randpop[0][1]);  //putting "Ukraines" into the world upon resetting at various locations
        addObject(new WilsonCreek(),randpop[1][0], randpop[1][1]);  //putting "Ukraines" into the world upon resetting at various locations
        addObject(new GlorietaPass(),randpop[2][0], randpop[2][1]);  //putting "Ukraines" into the world upon resetting at various locations
        addObject(new Gettysburg(),randpop[3][0], randpop[3][1]);  //putting "Ukraines" into the world upon resetting at various locations
        addObject(new Vicksburg(),randpop[4][0], randpop[4][1]);  //putting "Ukraines" into the world upon resetting at various locations
        addObject(new Antietam(),randpop[5][0], randpop[5][1]);  //putting "Ukraines" into the world upon resetting at various locations
        addObject(new BullRun(),randpop[6][0], randpop[6][1]);  //putting "Ukraines" into the world upon resetting at various locations
        
       
        addObject(new America(), 830, 200);
    }
   
   }
 
