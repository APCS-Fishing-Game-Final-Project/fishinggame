import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PaleChub here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PaleChub extends Fish
{
    private GreenfootImage ogImage;
    private GreenfootImage flipImage;
    private int speed;
    /**
     * Act - do whatever the PaleChub wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PaleChub() {
        ogImage = new GreenfootImage("smlfish.png");
        flipImage = new GreenfootImage("smlfishflip.png");
        speed = -1;
        if (Math.random() < 0.5) {
            setImage(flipImage);
            speed = 1;
        }
    }
    
    public void act() 
    {
        swim();
        if ( getX() == 1 || getX() == 899){
            disappearAtEdge();
        }
    }    
    
    public void swim() {
        super.swim(speed);
    }
    
    public void ifTouchingBait(){
        if(isTouching(Bait.class))
        { 
            getWorld().removeObject(this);
        }
    }
}
