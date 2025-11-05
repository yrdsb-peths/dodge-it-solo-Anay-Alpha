import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

<<<<<<< Updated upstream

public class Apple extends Actor
{

    public void act()
    {
        move(-10);
        if(getX() <= 0)
        {
            resetApple();
        }
        
        
        if(isTouching(Hero.class))
        {
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200); 
            getWorld().removeObject(this);
        }
        

    }
    
    public void resetApple()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600, 100);
        }
        else
        {
            setLocation(600, 300);
        }
=======
/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
>>>>>>> Stashed changes
    }
}
