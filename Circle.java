import java.awt.*;
public class Circle
{
    private int x;
    private int y;
    private int radius;
    private int levels;
    private int stepChange;
    public Circle(int x, int y, int radius, int levels)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.levels = levels;
        this.stepChange = radius/levels;
    }
    public void draw(Graphics g)
    {
        g.setColor(Color.BLACK);
        drawCircle(x, y, radius, levels, g);
    }
    public void drawCircle(int x, int y, int radius, int levels, Graphics g)
    {
       if(levels <=0)
       {
           return;
       }
       g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
       
       drawCircle(x-stepChange, y-stepChange, radius-stepChange, levels-1, g);
       
       drawCircle(x+stepChange, y+stepChange, radius-stepChange, levels-1, g);
       
       drawCircle(x-stepChange, y+stepChange, radius-stepChange, levels-1, g);
       
       drawCircle(x+stepChange, y-stepChange, radius-stepChange, levels-1, g);
    }
}