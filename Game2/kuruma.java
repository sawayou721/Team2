import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kuruma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kuruma extends Actor
{
    /**
     * Act - do whatever the kuruma wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(-90);
        move(1);
    }// Add your action code here.
    }    
}
