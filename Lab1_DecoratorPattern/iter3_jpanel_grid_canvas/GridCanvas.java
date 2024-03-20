package iter3_jpanel_grid_canvas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GridCanvas extends JPanel {
    private final int id,w,h;

    private final Color color;

    public GridCanvas(int id, Color color, int w, int h) {
        setPreferredSize(new Dimension(w, h));
        this.id = id;
        this.color = color;
        this.w = w;
        this.h = h;
    }

    public GridCanvas(int id, Color color) {
        this(id, color, 300, 300);

    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.setFont(new Font("Courier", Font.BOLD, 20));
        this.drawQuadrantAt(id, g);
        g.setColor(Color.BLACK);
        this.drawAllBorder(g);
    }


    public void drawQuadrantAt(int quadrant_index, Graphics g) {
        int arcAngle = 90;
        int circle_radius = 400;


        switch (quadrant_index) {
            case 1:
                g.drawString("Q1", 25, 25);
                g.setColor(Color.BLACK);
                g.drawArc(100, 100, circle_radius, circle_radius, 90, arcAngle);
                g.setColor(color);
                g.fillArc(100, 100, circle_radius, circle_radius, 90, arcAngle);
                break;
            case 2:
                g.drawString("Q2", 250, 25);
                g.setColor(Color.BLACK);
                g.drawArc(-200, 100, circle_radius, circle_radius, 0, arcAngle);
                g.setColor(color);
                g.fillArc(-200, 100, circle_radius, circle_radius, 0, arcAngle);
                break;
            case 3:
                g.drawString("Q3", 25, 275);
                g.setColor(Color.BLACK);
                g.drawArc(100, -200, circle_radius, circle_radius, 180, arcAngle);
                g.setColor(color);
                g.fillArc(100, -200, circle_radius, circle_radius, 180, arcAngle);
                break;
            case 4:
                g.drawString("Q4", 250, 275);
                g.setColor(Color.BLACK);
                g.drawArc(-200, -200, circle_radius, circle_radius, 270, arcAngle);
                g.setColor(color);
                g.fillArc(-200, -200, circle_radius, circle_radius, 270, arcAngle);
                break;
            default:
                break;

        }
    }


    public void drawAllBorder(Graphics g){
        this.drawTopBorder(g);
        this.drawBottomBorder(g);
        this.drawLeftBorder(g);
        this.drawRightBorder(g);
    }

    public void drawLeftBorder(Graphics g){
        g.drawLine(0,0,0,h);
    }

    public void drawRightBorder(Graphics g){
        g.drawLine(w, 0, w, h);

    }

    public void drawTopBorder(Graphics g){
        g.drawLine(0, 0, w, 0);
    }

    public void drawBottomBorder(Graphics g){
        g.drawLine(0, h, w, h);
    }

}
