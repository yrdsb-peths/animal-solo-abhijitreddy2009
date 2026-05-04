import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, our hero.
 * 
 * @author Abhijit
 * @version Apr 28 2026
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephant.mp3");
    
    GreenfootImage idle = new GreenfootImage("images/elephant_idle/idle0.png");
    
    
    public Elephant()
    {
        setImage(idle);
    }
    
    public void act()
    {
        
        if (Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move(+2);
        }
        
        
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);   
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
    }
}
