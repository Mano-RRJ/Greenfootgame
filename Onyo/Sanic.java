import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Sanic extends Actor
{
    int health = 3;
    Player player;
    Counter counter;
    public Sanic(Player mainPlayer, Counter counter)
    {
        this.counter = counter;
        player = mainPlayer;
        setImage("sanic.png");
        getImage().scale(80,80);
    }
    public void act() 
    {        
        moveAround();   
        hitByProjectile();
    }    
    public void moveAround()
    {
        move(4);
        turnTowards(player.getX(), player.getY());
    }
    public void hitByProjectile()
    {
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if(projectile != null)
        {
            health--;
            getWorld().removeObject(projectile);
        }
        if(health == 0)
        {
            counter.score++;
            counter.money+=2;
            getWorld().removeObject(this);
        }
    } 
}