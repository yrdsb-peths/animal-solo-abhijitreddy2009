import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our elephant
 * 
 * @Abhijit
 * @version April 2026
 */
public class Apple extends Actor
{
    int speed = 1;
    public Apple()
    {
        GreenfootImage image = new GreenfootImage("apple1.png");
        image.scale(40, 40);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + 2);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
