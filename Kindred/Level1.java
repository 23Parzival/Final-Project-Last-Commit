import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {    
        super(1200, 700, 1); 
        //create enemy
        Enemy enemy = new Enemy();
        addObject(enemy, 400, 150);

        Enemy enemy2 = new Enemy();
        addObject(enemy2, 500, 350);

        Enemy enemy3 = new Enemy();
        addObject(enemy3, 600, 500);
        
        Enemy enemy4 = new Enemy();
        addObject(enemy4,291,584);
        
        Enemy enemy5 = new Enemy();
        addObject(enemy5,640,84);

        //create health bar for enemy
        HealthBar hb = new HealthBar(enemy, enemy.getImage().getWidth(), 5);
        addObject(hb, enemy.getX(), enemy.getY() - enemy.getImage().getHeight() / 2 - 5);  

        HealthBar hb2 = new HealthBar(enemy2, enemy2.getImage().getWidth(), 5);
        addObject(hb2, enemy2.getX(), enemy2.getY() - enemy2.getImage().getHeight() / 2 - 5);

        HealthBar hb3 = new HealthBar(enemy3, enemy3.getImage().getWidth(), 5);
        addObject(hb3, enemy3.getX(), enemy3.getY() - enemy3.getImage().getHeight() / 2 - 5);
        
        HealthBar hb4 = new HealthBar(enemy4, enemy4.getImage().getWidth(), 5);
        addObject(hb4, enemy4.getX(), enemy4.getY() - enemy4.getImage().getHeight() / 2 - 5);

        HealthBar hb5 = new HealthBar(enemy5, enemy5.getImage().getWidth(), 5);
        addObject(hb5, enemy5.getX(), enemy5.getY() - enemy5.getImage().getHeight() / 2 - 5);

        Player player = new Player();
        addObject(player, 100, 300); //anywhere in the world

        //add HUD health bar at top-left corner (x=60, y=15)
        HealthBar playerBar = new HealthBar(player, 400, 25, 220, 50);
        addObject(playerBar, 220, 50);

        Boss boss = new Boss();
        addObject(boss, 1000, 350);

        HealthBar hb6 = new HealthBar(boss, boss.getImage().getWidth(), 5);
        addObject(hb6, boss.getX(), boss.getY() - boss.getImage().getHeight() / 2 - 5);

        addObject(new XpCounter(player), 550, 45);

        addObject(new SkillTree(player), 1200-85, 55);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();
        addObject(wall,560,572);
        Wall wall2 = new Wall();
        addObject(wall2,647,397);
        Wall wall3 = new Wall();
        addObject(wall3,643,220);
        Wall wall4 = new Wall();
        addObject(wall4,471,134);
        Wall wall5 = new Wall();
        addObject(wall5,1072,221);
        Wall wall6 = new Wall();
        addObject(wall6,1158,307);
        Wall wall7 = new Wall();
        addObject(wall7,1157,396);
        Wall wall8 = new Wall();
        addObject(wall8,1076,480);
        Wall wall9 = new Wall();
        addObject(wall9,43,137);
        Wall wall10 = new Wall();
        addObject(wall10,130,136);
        Wall wall11 = new Wall();
        addObject(wall11,217,221);
        Wall wall12 = new Wall();
        addObject(wall12,218,395);
        Wall wall13 = new Wall();
        addObject(wall13,131,480);
        Wall wall14 = new Wall();
        addObject(wall14,43,479);
        wall.setLocation(470,576);
        wall.setLocation(480,545);
        wall.setLocation(492,581);
        wall.setLocation(476,569);
        Wall wall15 = new Wall();
        addObject(wall15,818,569);
        Wall wall16 = new Wall();
        addObject(wall16,816,134);
        wall2.setLocation(660,388);
        wall2.setLocation(641,387);
        wall2.setLocation(652,393);
        wall2.setLocation(655,412);
        wall2.setLocation(644,400);
        wall2.setLocation(632,385);
        wall2.setLocation(632,390);
        wall2.setLocation(651,401);
        wall2.setLocation(653,403);
        wall2.setLocation(644,395);
        HealthItem healthItem = new HealthItem();
        addObject(healthItem,912,654);
        HealthItem healthItem2 = new HealthItem();
        addObject(healthItem2,732,226);
        HealthItem healthItem3 = new HealthItem();
        addObject(healthItem3,388,484);
        HealthItem healthItem4 = new HealthItem();
        addObject(healthItem4,298,137);
    }
}
