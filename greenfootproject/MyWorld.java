import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class myWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class myWorld extends World
{
    private Player player;
    
    /**
     * Constructor for objects of class myWorld.
     * 
     */
    public myWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        
        player = new Player();
        addObject(player, 460, 530);
    }
}
