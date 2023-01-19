import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kabe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kabe extends Actor
{
    /**
     * Act - do whatever the kabe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int movecount =0;
    public void act() 
    {
            
             move(3);
            if(movecount%30==0){
              int A = 0;
              int B = 359;
              int C = A + (int)(Math.random()*((B-A)+1));
              setRotation(C);
              movecount=1;
      }
      movecount++;
            
            
        Actor actor = getOneIntersectingObject( player.class );
        if( actor != null ){
            getWorld().showText( "GAME OVER", 300, 200 );
            Greenfoot.stop();
        }   
    }    
}
