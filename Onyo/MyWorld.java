import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    int count = 0;
    int spawnSpeed = 45;
    int randomSpawn = Greenfoot.getRandomNumber(8);
    public Player mainPlayer = new Player();
    Counter counter = new Counter();
    Healthbar healthbar = new Healthbar();
    WeaponButton weaponButton = new WeaponButton(counter);
    SuperPower superPower = new SuperPower();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 1000, 1); 
        mainPlayer = new Player(weaponButton, superPower);
        addObject(mainPlayer, getWidth()/2, getHeight()/2);
        addObject(counter, 130, 100);
        addObject(healthbar, mainPlayer.getX() - 5, mainPlayer.getY() - 50);
        addObject(weaponButton, 900, 100);
        addObject(superPower, mainPlayer.getX() + 10, mainPlayer.getY() - 80);
    }
    public Player getPlayer()
    {
        return mainPlayer; 
    }
    public void act()
    {
        count++;
        if(count % 600 ==0)
        {
            spawnSpeed--;
        }
        while(Greenfoot.isKeyDown("p"))
        {
            Greenfoot.delay(1);
        }
        spawnMemes();
    }
    public void spawnMemes()
    {
        if ( count % spawnSpeed == 0)
        {
            randomSpawn = Greenfoot.getRandomNumber(8);
            switch(randomSpawn){
            case 0 : addObject(new Octochin(mainPlayer,counter),0,35); break;
            case 1 : addObject(new Onyo3(mainPlayer,counter), getWidth()/2,2); break;
            case 2 : addObject(new Onyoshek(mainPlayer,counter), getWidth(),0); break;
            case 3 : addObject(new Poopoo(mainPlayer,counter), 0, getHeight()/2); break;
            case 4 : addObject(new Roblox(mainPlayer,counter),getWidth(), getHeight()/2); break;
            case 5 : addObject(new Sanic(mainPlayer,counter),0, getHeight()); break;
            case 6 : addObject(new Thanos(mainPlayer,counter),getWidth()/2,getHeight()); break;
            case 7 : addObject(new Tyler(mainPlayer,counter),getWidth(), getHeight()); break;
            }
        }
    }
}
