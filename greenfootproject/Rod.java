import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rod extends Actor
{
    /**
     * Act - do whatever the Rod wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Rod()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()-32, image.getHeight()-370);
        setImage(image);
    }
    public void act() 
    {
        controlMovement();
        castRod();
    }   
    public void controlMovement() {
        if ( Greenfoot.isKeyDown("left") ) {
            setLocation( getX()-6, getY() );
        }
        if ( Greenfoot.isKeyDown("right") ) {
            setLocation(getX()+6, getY());
        }
    }  
    public void castRod(){
        
    }
}
