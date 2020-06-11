import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Catfish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Catfish extends Fish
{
    private GreenfootImage ogImage;
    private GreenfootImage flipImage;
    private int speed;
    
    /**
     * Act - do whatever the Catfish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Catfish() {
        ogImage = new GreenfootImage("medfish.png");
        flipImage = new GreenfootImage("medfishflip.png");
        speed = -1;
        if (Math.random() < 0.5) {
            setImage(flipImage);
            speed = 1;
        }
    }
    
    public void act() {
        swim();
        ifTouchingBait();
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
