import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.lang.Math;
  //Necessary imports

/**
 * The Russia Class
 * 
 * @author Parth Joshi, Ethan Lau, Arav Vyawahare, Jonathan Wang
 * @version 2.0 Sept 20, 2019
 */
public class Russia extends World  //RUSSIA, the world class here
{
    public static Counter scoreCounter; //Our counter this evening is named "scoreCounter"
    private boolean musicStart = true;
    public static GreenfootSound backgroundMusic = new GreenfootSound("civilwartheme.mp3"); //Background music
    int [][] randpop = new int[9][2]; //initializes randpop 2D Array
    
    /**
     * Constructer of the Russia Class. Defines the size of the world and starts background music and volume. Calls upon the populateWorld() class. 
     */
    public Russia()
    {    
        super(960, 540, 1);  // Create a new world with 960 x 540 dimensions
        populateWorld();   // Calls upon populateWorld() method
        backgroundMusic.playLoop(); // Plays the background music until stop
        backgroundMusic.setVolume(25); // Set Volume
        
    }
    
    /**
     * Method used to place objects in the world. Called upon by the Russia constructer. 
     */
    public void populateWorld()  
    {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c <2;c++) {
                randpop[r][c] = (int)(Math.random()*960);
            }
        }
        Counter scoreCounter = new Counter(); //Establishes the new counter called "scoreCounter"
        addObject(scoreCounter, 50, 20); //Where the counter will be located
        Lee scoreboard = new Lee(scoreCounter); //Creates a Lee object to relate to the counter
        
        addObject(new Lee(scoreCounter), 100, 400); //puts a single "Putin" into the world originally
        

        addObject(new FortSumter(),randpop[0][0], randpop[0][1]);  //putting "Ukraines" into the world upon resetting at various locations
        addObject(new WilsonCreek(),randpop[1][0], randpop[1][1]);  //putting "Ukraines" into the world upon resetting at various locations
        addObject(new GlorietaPass(),randpop[2][0], randpop[2][1]);  //putting "Ukraines" into the world upon resetting at various locations
        addObject(new Gettysburg(),randpop[3][0], randpop[3][1]);  //putting "Ukraines" into the world upon resetting at various locations
        addObject(new Vicksburg(),randpop[4][0], randpop[4][1]);  //putting "Ukraines" into the world upon resetting at various locations
        addObject(new Antietam(),randpop[5][0], randpop[5][1]);  //putting "Ukraines" into the world upon resetting at various locations
        addObject(new BullRun(),randpop[6][0], randpop[6][1]);  //putting "Ukraines" into the world upon resetting at various locations
        addObject(new Davis(), randpop[7][0], randpop[7][1]);
        addObject(new Lincoln(), randpop[8][0], randpop[8][1]);
       
        addObject(new Grant(), 900, 100);
    }
   
   }
 
