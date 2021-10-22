package fractal;

import java.awt.Dimension;

import javax.swing.JFrame;
/**
 * Write a description of class FractalTreeViewer here.
 * This class displays the fractal tree
 * @sdmarlowe
 * @4/9/18
 */
public class TreeViewer extends JFrame
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TreeViewer()
    {
        this.setTitle("Fractal Tree");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TreeComponent panel = new TreeComponent();
        panel.setPreferredSize(new Dimension(700,500));
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        TreeViewer s = new TreeViewer();
    }
}
