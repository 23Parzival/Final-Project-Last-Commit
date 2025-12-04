import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    private int timer = 350;
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        super(1200, 700, 1);
        GreenfootImage bg = new GreenfootImage("youlose.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
    }
    
    public void act() 
    {
        timer--;
        if (timer <= 0) {
            SoundController.stopLoseMusic();
            SoundController.startMenuMusic();
            Greenfoot.setWorld(new MainMenu());
        }
    }
}
