import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class WeaponButton extends Actor
{
    Counter counter;
    int weaponUpgrade = 1;
    public WeaponButton(Counter counter)
    {
        this.counter = counter;
        setImage(new GreenfootImage("Weapon \n Upgrade \n (150 Cash)", 25, Color.WHITE, new Color(0,0,0,0)));
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this) && counter.money > 149)
        {
            counter.money -= 150;
            weaponUpgrade++;
        }
        if(weaponUpgrade>3)
        weaponUpgrade=3;
    }    
}
