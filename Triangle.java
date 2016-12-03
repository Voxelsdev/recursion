import java.awt.*;
public class Triangle
{
    private int x;
    private int y;
    private int sideLength;
    private int depth;
    public Triangle(int x, int y, int sideLength, int depth)
    {
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
        this.depth = depth;
    }
    public void draw(Graphics g)
    {
        g.setColor(Color.MAGENTA);
        this.drawTriangle(g, x, y, sideLength, 0);
    }
    public void drawTriangle(Graphics g, int x, int y, int sideLength, int depth)
    {
        g.drawLine(x, y, x+sideLength, y);
        g.drawLine(x+sideLength, y, x+sideLength/2, y-sideLength);
        g.drawLine(x+sideLength/2, y-sideLength, x, y);
        if(depth == this.depth)
        {
            return;
        }
        drawTriangle(g, x, y, sideLength/2, depth+1);
        drawTriangle(g, x+sideLength/2, y, sideLength/2, depth+1);
        drawTriangle(g, x+sideLength/4, y, sideLength/2, depth+1);
        
    }
}