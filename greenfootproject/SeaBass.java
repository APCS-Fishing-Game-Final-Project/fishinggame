import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SeaBass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SeaBass extends Fish
{
    private GreenfootImage ogImage;
    private GreenfootImage flipImage;
    private int speed;
    /**
     * Act - do whatever the SeaBass wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SeaBass() {
        ogImage = new GreenfootImage("bigfish.png");
        flipImage = new GreenfootImage("bigfishflip.png");
        speed = -1;
        if (Math.random() < 0.5) {
            setImage(flipImage);
            speed = 1;
        }
    }
    
    public void act() {
        swim();
        if ( getX() == 1 || getX() == 899){
            disappearAtEdge();
        }
    }   

    public void swim() {
        super.swim(speed);
    }
       
}
