import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Healthbar extends Actor
{
    int health = 50;
    double specificHealth = (double)health;
    public Healthbar()
    {
        setImage(new GreenfootImage(52, 12));
        getImage().drawRect(0,0,51,11);
        getImage().setColor(Color.GREEN);
        getImage().fillRect(1,1,health,10);
    }
    public void act() 
    {
        setImage(new GreenfootImage(52, 12));
        getImage().drawRect(0,0,51,11);
        getImage().setColor(Color.GREEN);
        getImage().fillRect(1,1,health,10);
        World world = getWorld();
        MyWorld myWorld = (MyWorld)world;
        setLocation(myWorld.getPlayer().getX() - 5, myWorld.getPlayer().getY()-50);
        LoseHealth();
    }    
    public void LoseHealth()
    {
        World world = getWorld();
        MyWorld myWorld = (MyWorld)world;
        if(myWorld.getPlayer().gotHit())
        {
            health--;
        }
        if(health<=0)
        {
        getWorld().showText("Noob! \n You only lasted " + (myWorld.getPlayer().time/60) + " seconds" , getWorld().getWidth()/2, getWorld().getHeight()/2);
        Greenfoot.stop();
        } 
    }
}
