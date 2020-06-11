import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Points here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Points extends Actor
{
    int points = 0;
    /**
     * Act - do whatever the Points wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Points()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()-720, image.getHeight()-145);
        setImage(image);
    }
    public void act() 
    {
        setImage(new GreenfootImage(" " + points, 30, Color.BLACK, null));
        setLocation(180,40);
        addPoints();
    }   
    public void addPoints() 
    {
        points++;
    }  
}
