import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Counter extends Actor
{
    int score;
    int money;
    public Counter ()
    {
        setImage(new GreenfootImage("Score: " + score + "\n Cash: " + money, 40, Color.WHITE, new Color (0, 20, 0, 0)));
    }
    public void act() 
    {
        setImage(new GreenfootImage("Score: " + score + "\n Cash: " + money, 40, Color.WHITE, new Color (0, 20, 0, 0)));
    }    
}
