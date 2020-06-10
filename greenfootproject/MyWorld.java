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
    private BarBack barBack;
    private BarFrame barFrame;
    private BarColor barColor;
    
    /**
     * Constructor for objects of class myWorld.
     * 
     */
    public myWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1, false); 
        
        player = new Player();
        addObject(player, 460, 530);
        
        barBack = new BarBack();
        addObject(barBack, 57, 500);
        
        barFrame = new BarFrame();
        addObject(barFrame, 57, 500);
        
        barColor = new BarColor();
        addObject(barColor, 57, 703);
        
        setPaintOrder(BarFrame.class, BarColor.class, BarBack.class);
    }
    
    public void act() {
        generateSeaBass();
        generateCatfish();
        generatePaleChub();
    }
    
    public void generateSeaBass() {
        if ( Math.random() < 0.003 ) {
            addObject(new SeaBass(), (int) ( Math.random()*500 + 200), (int) (Math.random()*300) + 100);
        }
    }
    public void generateCatfish() {
        if ( Math.random() < 0.004 ) {
            addObject(new Catfish(), (int) ( Math.random()*500 + 200), (int) (Math.random()*300) + 100);
        }
    }
    public void generatePaleChub() {
        if ( Math.random() < 0.001 ) {
            addObject(new PaleChub(), (int) ( Math.random()*500 + 200), (int) (Math.random()*300) + 100);
        }
    }
}
