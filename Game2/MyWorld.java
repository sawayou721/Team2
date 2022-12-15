import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int timecount = 3000;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
     GreenfootSound backgroundMusic = new GreenfootSound("musicfile.mp3");
     
    public MyWorld()
    { 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject( new player(), 10, 50 );
        backgroundMusic.playLoop();
    }
    public void act() 
        {
            timecount--;
            showText( ""+timecount, 25, 20 );
            if( timecount == 0 ){
                showText( "TIME OVER", 300, 200 );
                Greenfoot.stop();
            }
        }
}
