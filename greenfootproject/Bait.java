import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bait here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bait extends Actor
{
    /**
     * Act - do whatever the Bait wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        controlMovement();
        catchFish();
    }   
    
    
    public void controlMovement() {
        if ( Greenfoot.isKeyDown("left") ) {
            setLocation( getX()-6, getY() );
        }
        if ( Greenfoot.isKeyDown("right") ) {
            setLocation(getX()+6, getY());
        }
    }   
    
    public void catchFish() {
        if (Greenfoot.isKeyDown("left") ) {
            
        }

    }   
}
