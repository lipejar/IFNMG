/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private boolean drawn;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            Circle chao = new Circle();
            chao.makeVisible();
            chao.changeColor("green");
            chao.changeSize(800);
            chao.moveHorizontal(-380);
            chao.moveVertical(120);
            
            Person Eu_Magrin = new Person();
            Eu_Magrin.makeVisible();
            Eu_Magrin.moveVertical(-20);
            
            Person Eu_Fortin = new Person();
            Eu_Fortin.makeVisible();
            Eu_Fortin.changeSize(50,50);
            Eu_Fortin.moveRight();
            Eu_Fortin.moveRight();
            Eu_Fortin.moveVertical(6);
            Eu_Fortin.moveHorizontal(25);
            
            Circle Sol = new Circle();
            Sol.makeVisible();
            Sol.changeColor("yellow");
            Sol.moveHorizontal(120);
            Sol.moveVertical(-40);
            
            drawn = true;
            
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
