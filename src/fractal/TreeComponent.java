package fractal;

import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.Line2D;
/**
 * Write a description of class FractalTree here.
 * Component class of the fractal tree
 * @sdmarlowe
 * @4/5/18
 */
public class TreeComponent extends JPanel
{
    /**
	 * 
	 */
	public TreeComponent()
    {
        setPreferredSize(new Dimension(700,500));
    }
    
    public void paintComponent (Graphics page)
    {
        super.paintComponent (page);
        Color c = new Color(255,0,102);
        page.setColor (c);
        drawFractal(page,50,350,500,Math.PI/2,0);
    }
    
    public void drawFractal (Graphics page, double prevLength, double x, double y, double prevAngle, int order)
    {
        Graphics2D g2 = (Graphics2D) page;
        prevLength *= .97;
        double angleR = prevAngle - .25;
        double angleL = prevAngle + .25;
        double xr = Math.cos(angleR) * prevLength;
        double newXr = x + xr;
        double yr = Math.sin(angleR) * prevLength;
        double newYr = y - yr;
        double xl = Math.cos(angleL) * prevLength;
        double newXl = x + xl;
        double yl = Math.sin(angleL) * prevLength;
        double newYl = y - yl;
        Line2D.Double line = new Line2D.Double(x, y, newXr, newYr);
        g2.draw(line);
        Line2D.Double line1 = new Line2D.Double(x, y, newXl, newYl);
        g2.draw(line1);
        if(order < 15)
        {
            order++;
            drawFractal(page,prevLength,newXr,newYr,angleR,order+1);
            drawFractal(page,prevLength,newXl,newYl,angleL,order+1);
        }
    }
}