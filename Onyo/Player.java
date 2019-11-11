import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Player extends Actor
{
int speed = 5;
int time = 0; 
WeaponButton weaponButton;
SuperPower superPower;     
int superTimer;
public Player()
{
        setImage(new GreenfootImage(70,50));
        getImage().setColor(Color.RED);
        getImage().fillOval(0,0,50,50);
        getImage().setColor(Color.WHITE);
        getImage().fillRect(50, 20, 70, 10);
}
public Player(WeaponButton weaponButton, SuperPower superPower)
{
        this.superPower = superPower;
        this.weaponButton = weaponButton;
        setImage(new GreenfootImage(70,50));
        getImage().setColor(Color.RED);
        getImage().fillOval(0,0,50,50);
        getImage().setColor(Color.WHITE);
        getImage().fillRect(50, 20, 70, 10);
}
public void act() 
{
        time++;
        turnAround();
        moveAround();
        fireProjectile();
        gotHit();
        superPowerUsed();
}
public void turnAround()
{
        if(Greenfoot.getMouseInfo() !=null)
        turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
}
public void moveAround()
{
       if(Greenfoot.isKeyDown("w"))
        setLocation(getX(),getY() - speed);
       if(Greenfoot.isKeyDown("a"))
       setLocation(getX() - speed, getY());
       if(Greenfoot.isKeyDown("s"))
       setLocation(getX(),getY() + speed);
       if(Greenfoot.isKeyDown("d"))
       setLocation(getX() + speed, getY()); 
}
public void fireProjectile()
{
    if(Greenfoot.mousePressed(null) && weaponButton.weaponUpgrade == 1){
    Projectile projectile = new Projectile();
    getWorld().addObject(projectile, getX(), getY());
    projectile.setRotation(getRotation());
    projectile.move(25);
    }
    if(Greenfoot.mousePressed(null) && weaponButton.weaponUpgrade == 2){
    Projectile projectile = new Projectile();
    getWorld().addObject(projectile, getX(), getY());
    projectile.setRotation(getRotation()-5);
    projectile.move(25);
    
    Projectile projectile2 = new Projectile();
    getWorld().addObject(projectile2, getX(), getY());
    projectile2.setRotation(getRotation()+5);
    projectile2.move(25);
    }
    if(Greenfoot.mousePressed(null) && weaponButton.weaponUpgrade == 3){
    Projectile projectile = new Projectile();
    getWorld().addObject(projectile, getX(), getY());
    projectile.setRotation(getRotation()-10);
    projectile.move(25);
    
    Projectile projectile2 = new Projectile();
    getWorld().addObject(projectile2, getX(), getY());
    projectile2.setRotation(getRotation()+10);
    projectile2.move(25);
    
    Projectile projectile3 = new Projectile();
    getWorld().addObject(projectile3, getX(), getY());
    projectile3.setRotation(getRotation());
    projectile3.move(25);
    }
}
public void superPowerUsed()
{
    if(superPower.superCount > 99 && superTimer < 30)
    {
    Projectile projectile = new Projectile();
    getWorld().addObject(projectile, getX(), getY());
    projectile.setRotation(getRotation()-60);
    projectile.move(25);
    
    Projectile projectile2 = new Projectile();
    getWorld().addObject(projectile2, getX(), getY());
    projectile2.setRotation(getRotation()+60);
    projectile2.move(25);
    
    Projectile projectile3 = new Projectile();
    getWorld().addObject(projectile3, getX(), getY());
    projectile3.setRotation(getRotation());
    projectile3.move(25);
    
    Projectile projectile1 = new Projectile();
    getWorld().addObject(projectile1, getX(), getY());
    projectile1.setRotation(getRotation()-180);
    projectile1.move(25);
    
    Projectile projectile21 = new Projectile();
    getWorld().addObject(projectile21, getX(), getY());
    projectile21.setRotation(getRotation()+120);
    projectile21.move(25);
    
    Projectile projectile31 = new Projectile();
    getWorld().addObject(projectile31, getX(), getY());
    projectile31.setRotation(getRotation() - 120);
    projectile31.move(25);
    superTimer++;
    }
    if(superTimer>29)
    {
        superPower.superCount = 0;
        superTimer = 0;
    }
}
public boolean gotHit()
{
    Actor Octochin = getOneObjectAtOffset(0,0, Octochin.class);
    Actor Onyo3 = getOneObjectAtOffset(0,0, Onyo3.class);
    Actor Onyoshek = getOneObjectAtOffset(0,0, Onyoshek.class);
    Actor Poopoo = getOneObjectAtOffset(0,0, Poopoo.class);
    Actor Roblox = getOneObjectAtOffset(0,0, Roblox.class);
    Actor Sanic = getOneObjectAtOffset(0,0, Sanic.class);
    Actor Thanos = getOneObjectAtOffset(0,0, Thanos.class);
    Actor Tyler = getOneObjectAtOffset(0,0, Tyler.class);
    if(Octochin!=null)
    {
        return true;
    } 
    else
    if(Onyo3!=null)
    {
        return true;
    }
    else
    if(Onyoshek!=null)
    {
        return true;
    }
    else
    if(Poopoo!=null)
    {
        return true;
    }
    else
    if(Roblox!=null)
    {
        return true;
    }
    else
    if(Sanic!=null)
    {
        return true;
    }
    else
    if(Thanos!=null)
    {
        return true;
    }
    else
    if(Tyler!=null)
    {
        return true;
    }
    else
    return false;   
}
}