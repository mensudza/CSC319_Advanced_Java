package iter2_jpanel_main_canvas;

import com.sun.tools.javac.Main;
import iter3_jpanel_grid_canvas.GridCanvas;
import iter4_fillarc_strategy.ColorStrategy;
import iter4_fillarc_strategy.DefaultColorStrategy;

import javax.swing.JPanel;
import java.awt.*;

public class MainCanvas extends JPanel {
    private ColorStrategy colorPalette;
    public MainCanvas(int w, int h, ColorStrategy colorPalette){
        setPreferredSize(new Dimension(w,h));
        setLayout(new GridLayout(2,2));

        this.colorPalette = colorPalette;
        this.createFourGrid();
    }

    public MainCanvas(ColorStrategy  colorPalette){
        this(600, 600,  colorPalette);
    }
    public MainCanvas(){
        this(600,600, new DefaultColorStrategy());
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(300, 0, 300, 600);
        g.drawLine(0, 300, 600, 300);
        g.drawOval(100, 100, 400, 400);
    }

    public void createFourGrid(){
        for(int i = 0; i<4;i++){
            add(new GridCanvas(i+1,  colorPalette.getColor(i)));
        }
    }

}
