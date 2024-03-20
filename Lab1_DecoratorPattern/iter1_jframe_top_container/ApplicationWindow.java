package iter1_jframe_top_container;

import com.sun.tools.javac.Main;
import iter2_jpanel_main_canvas.MainCanvas;
import iter4_fillarc_strategy.DefaultColorStrategy;
import iter4_fillarc_strategy.RandomColorStrategy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationWindow implements ActionListener {
    private JFrame topCon;
    private MainCanvas mainCanvas;
    public ApplicationWindow(int w, int h){
        mainCanvas = new MainCanvas(new DefaultColorStrategy());

        topCon = new JFrame("Composite in Action");
        topCon.setSize(w, h);
        topCon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        topCon.setJMenuBar(menuBar);
        JMenu colorMenu = new JMenu("Color Option");
        menuBar.add(colorMenu);

        JMenuItem defaultColors = new JMenuItem("Default");
        defaultColors.addActionListener(this);

        JMenuItem randomColors = new JMenuItem("Random");
        randomColors.addActionListener(this);

        colorMenu.add(defaultColors);
        colorMenu.add(randomColors);

        topCon.add(mainCanvas);
        topCon.pack();
        topCon.setVisible(true);

    }

    public ApplicationWindow(){
        this(600,600);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        topCon.setVisible(false);

        topCon.remove(mainCanvas);
        mainCanvas = this.changeColorPalette(command);
        topCon.add(mainCanvas);

        topCon.setVisible(true);
    }

    public MainCanvas changeColorPalette(String command) {
        if (command.equals("Random")) {
            return new MainCanvas(new RandomColorStrategy());
        } else {
            return new MainCanvas(new DefaultColorStrategy());
        }
    }
}