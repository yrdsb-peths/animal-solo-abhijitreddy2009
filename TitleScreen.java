import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Abhijit
 * @version April 2026
 */
public class TitleScreen extends World
{
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,351,110);
        elephant.setLocation(494,169);
        elephant.setLocation(492,146);
        elephant.setLocation(512,151);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,139,261);
        label.setLocation(317,365);
        Label label2 = new Label("Use ← and →  to move", 40);
        addObject(label2,126,256);
        label2.setLocation(287,251);
        label2.setLocation(242,257);
        elephant.setLocation(275,86);
        label2.setLocation(339,286);
        elephant.setLocation(528,122);
        elephant.setLocation(506,105);
        label2.setLocation(161,200);
        label2.setLocation(363,203);
        label2.setLocation(237,221);
        Label label3 = new Label("Hungry Elephant", 60);
        addObject(label3,173,116);
        label3.setLocation(243,120);
        elephant.setLocation(528,128);
        elephant.setLocation(505,233);
        label2.setLocation(313,235);
        label2.setLocation(212,238);
        label2.setLocation(198,238);
    }
}
