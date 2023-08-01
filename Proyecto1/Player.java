import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (getY() <= 115){  
            setLocation(getX(), 116);
        }
        else if (getY() >= 500){
            setLocation(getX(), 499);
        }
        else if (getX() >= 934){
            setLocation(933, getY());
        }
        else if (getX() <= 21){
            setLocation(22, getY());
        }
        checkKeyPress();
        Star();
        punto();
    }
    public static int vScore = 0;
    public static int sScore = 0;
    public Player()
    {
        GreenfootImage azul = getImage();
        int myNewHeight = (int)azul.getHeight () /3;
        int myNewWidth = (int)azul.getWidth () /3;
        azul.scale (myNewWidth,myNewHeight);
    }
    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")){
            setRotation(270);
            move(5);
        }
        if (Greenfoot.isKeyDown("down")){
            setRotation(90);
            move(5);
        }
        if (Greenfoot.isKeyDown("left")){
            setRotation(180);
            move(5);
        }
        if (Greenfoot.isKeyDown("right")){
            setRotation(0);
            move(5);
        }
    }
    public void Star()
    {
        Actor star;
        star = getOneObjectAtOffset(0, 0, Star.class);
        if (star != null)
        {
           getWorld().removeObject(star); 
        
           World world;
           world = getWorld();
           sScore = sScore + 1;
        }
    }
    public void punto()
    {
        if (getX() >= 35 && getX() <= 85 && getY() >= 100 && getY() <= 510)
        {
            vScore = vScore + 1;
        }
    }

}
