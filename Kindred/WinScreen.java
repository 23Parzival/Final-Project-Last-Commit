import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen extends World
{
    private int timer = 350;
    
    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen()
    {    
        super(1200, 700, 1); 
        GreenfootImage bg = new GreenfootImage("youwin.png");
        bg.scale(getWidth(), getHeight()); 
        setBackground(bg);
    }
    
    public void act() 
    {
        SoundController sc = new SoundController();
        timer--;
        if (timer <= 0) {
            sc.stopWinMusic();
            Greenfoot.setWorld(new MainMenu());
        }
    }
}
