import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BarColor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BarColor extends Actor
{
    private int barHeight;
    /**
     * Act - do whatever the BarColor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BarColor() {
        barHeight = 0;
    }
    
    public void act() {
        barMovement();
    }    
    
    public void barMovement() {
        if (Greenfoot.isKeyDown("up") && !(getY() <= 500)) {
            setLocation( getX(), getY() - 2);
            barHeight = 703 - getY();
        } else if (getY() < 703) { 
            setLocation( getX(), getY() + 5);
        }
        if (barHeight > 40) {
            //castRod(40) from Rod class and find percent of barheight from 230-40 and cast the rod 699+that percent of 500
        }
    }
}
