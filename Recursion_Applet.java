import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

public class Recursion_Applet extends Applet{
    
    /**
    instance fields
     **/    
    private Dimension dim; //size of the applet in px
    private Image img;  //for image buffering
    private Graphics g;  //display graphics
    
    //instance fields for circle location
   
    //private Triangle triangle;
    private Circle circle;
    /**
     * Initialize the application (much like main method)
     * Initialize all of the instance fields
     * Set the applett size to 500x500
     */
    public void init(){
        
        this.resize(800, 800);
        //pass the size to the dim field
        this.dim = getSize();
        this.img = createImage(getWidth(), getHeight());
        g = img.getGraphics(); //tells the img to draw itself
        //triangle at x, y, sidelength, level
        //this.triangle = new Triangle(10, getHeight()-10, getWidth()-10, 9); 
        this.circle = new Circle(getWidth()/2, getHeight()/2, 300, 12);
    }
    public Color randomColor()
    {
        int r = (int)(Math.random()*255);
        int g = (int)(Math.random()*255);
        int b = (int)(Math.random()*255);
        Color c = new Color(r, g, b);
        return c;
    }
    /**
     * Draws the board for each frame. 
     * @parm gfx the name of the Graphics object to paint.
     */
    public void paint(Graphics gfx){
      //starting with the bg
      g.setColor(Color.WHITE);
      g.fillRect(0, 0, getWidth(), getHeight());
      //draw the circle
      //triangle.draw(g);
      circle.draw(g);
      //the most important part:
      gfx.drawImage(img, 0, 0, this);
    }
    
    /**
     * Call the paint method 
     * @param gfx the Graphics object to paint
     */
    public void update(Graphics gfx){
        paint(gfx);
    }
    
    
}